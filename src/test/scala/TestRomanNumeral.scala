import org.scalatest.FunSuite
import RomanNumeral._

class TestRomanNumeral extends FunSuite {

  test("convert should return 'I' if the given input is 1") {
    assert(convert(10) == "X")
  }

  test("convert should return as many 'I' as the units in the given input number if they are between 1 and 3") {
    assert(convert(1) == "I")
    assert(convert(3) == "III")
  }

  test("convert should return 'IV' if the given input number is 4") {
    assert(convert(4) == "IV")
  }

  test("convert should return 'V' if the given input number is 5") {
    assert(convert(5) == "V")
  }

  test("convert should return 'VII' if the given input number is 7") {
    assert(convert(7) == "VII")
  }

  test("convert should return 'IX' if the given input is 9") {
    assert(convert(9) == "IX")
  }

  test("convert should return 'X' if the given input is 10") {
    assert(convert(10) == "X")
  }

  test("convert should return as many 'X' as the tens in the given input number if they are between 1 and 3") {
    assert(convert(10) == "X")
    assert(convert(30) == "XXX")
  }

  test("convert should return 'XL' if the given input number is 40") {
    assert(convert(40) == "XL")
  }

  test("convert should return 'L' if the given input number is 50") {
    assert(convert(50) == "L")
  }

  test("convert should return 'LXXX' if the given input number is 80") {
    assert(convert(80) == "LXXX")
  }

  test("convert should return 'XC' if the given input number is 90") {
    assert(convert(90) == "XC")
  }

  test("convert should return 'C' if the given input is 100") {
    assert(convert(100) == "C")
  }

  test("convert should return as many 'C' as the hundreds in the given input number if they are between 1 and 3") {
    assert(convert(100) == "C")
    assert(convert(300) == "CCC")
  }

  test("convert should return 'CD' if the given input number is 400") {
    assert(convert(400) == "CD")
  }

  test("convert should return 'D' if the given input number is 500") {
    assert(convert(500) == "D")
  }

  test("convert should return 'DCCC' if the given input number is 800") {
    assert(convert(800) == "DCCC")
  }

  test("convert should return 'CM' if the given input number is 900") {
    assert(convert(900) == "CM")
  }

  test("convert should return 'M' if the given input is 1000") {
    assert(convert(1000) == "M")
  }

  test("convert should return as many 'M' as the thousands in the given input number if they are between 1 and 3") {
    assert(convert(1000) == "M")
    assert(convert(3000) == "MMM")
  }

  test ("convert should return 'XIX' if the given input is 19") {
    assert(convert(19) == "XIX")
  }

  test ("convert should return 'CCCLXV' if the given input is 365") {
    assert(convert(365) == "CCCLXV")
  }

  test ("convert should return 'MMDCXIX' if the given input is 2619") {
    assert(convert(2619) == "MMDCXIX")
  }

}
