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

    if (positionalOrder > 2) "M" * number
    else {
      val romanNumeralsForPosition = romanNumerals.get(positionalOrder).get
      if (number == 0) ""
      else if (number == 4) romanNumeralsForPosition._1 + romanNumeralsForPosition._2
      else if (number == 5) romanNumeralsForPosition._2
      else if (number == 9) romanNumeralsForPosition._1 + romanNumeralsForPosition._3
      else if (number > 5 && number < 9) romanNumeralsForPosition._2 + (romanNumeralsForPosition._1 * (number - 5))
      else romanNumeralsForPosition._1 * number
    }
  }
}
