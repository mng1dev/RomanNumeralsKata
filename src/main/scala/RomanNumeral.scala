import java.util

import scala.collection.mutable.ArrayBuffer

object RomanNumeral extends App {

  /**
    *
    * I V X
    * X L C
    * C D M
    */

  def convert(number: Int): String = {
    require(number < 4999)
    def digits: Array[Int] = {
      val numberDigits = ArrayBuffer[Int]()
      var arabNumber = number
      while (arabNumber > 0) {
        numberDigits.append(arabNumber % 10)
        arabNumber /= 10
      }
      numberDigits.toArray
    }

    val romanNumerals = for (idx: Int <- digits.indices)
      yield convertDigitToRomanNumeral(digits(idx), idx)

    romanNumerals.reverse.mkString("")
  }

  private def convertDigitToRomanNumeral(number: Int, positionalOrder: Int): String = {

    val romanNumerals: Map[Int, (String, String, String)] = Map(
      0 -> ("I", "V", "X"),
      1 -> ("X", "L", "C"),
      2 -> ("C", "D", "M")
    )

    if (positionalOrder == 3) "M" * number
    else {
      val romanNumeralsForPosition = romanNumerals.get(positionalOrder).get
      number match {
        case 0 => ""
        case 4 => romanNumeralsForPosition._1 + romanNumeralsForPosition._2
        case 5 => romanNumeralsForPosition._2
        case 9 => romanNumeralsForPosition._1 + romanNumeralsForPosition._3
        case _ if (number > 5 && number < 9) => romanNumeralsForPosition._2 + (romanNumeralsForPosition._1 * (number - 5))
        case _ => romanNumeralsForPosition._1 * number
      }
    }
  }
}
