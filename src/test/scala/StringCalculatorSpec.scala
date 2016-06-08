import org.scalatest.FlatSpec

class StringCalculatorSpec extends FlatSpec {

  "Calling Add with and empty string" should "return 0" in {
    assertResult(0) {
      StringCalculator.add("")
    }
  }

  "Calling Add with 1" should "return 1" in {
    assertResult(1) {
      StringCalculator.add("1")
    }
  }

  "Calling Add with 2" should "return 2" in {
    assertResult(2) {
      StringCalculator.add("2")
    }
  }

  "Calling Add with 1,1" should "return 2" in {
    assertResult(2) {
      StringCalculator.add("1,1")
    }
  }

  "Calling Add with 1,2" should "return 3" in {
    assertResult(3) {
      StringCalculator.add("1,2")
    }
  }

  "Calling Add with 1,2,3,0,4" should "return 10" in {
    assertResult(10) {
      StringCalculator.add("1,2,3,0,4")
    }
  }

  "Calling Add with 1\\n1" should "return 2" in {
    assertResult(2) {
      StringCalculator.add("1\n1")
    }
  }

  "Calling Add with 1\\n1,2" should "return 4" in {
    assertResult(4) {
      StringCalculator.add("1\n1,2")
    }
  }

  "Calling Add with //[~]1~2" should "return 3" in {
    assertResult(3) {
      StringCalculator.add("//[~]1~2")
    }
  }

  "Calling Add with //[xxx]1xxx2" should "return 3" in {
    assertResult(3) {
      StringCalculator.add("""//[xxx]1xxx2""")
    }
  }
  "Calling Add with //[xxx][~]1xxx2~3" should "return 6" in {
    assertResult(6) {
      StringCalculator.add("""//[xxx][~]1xxx2~3""")
    }
  }

  "Calling Add with //[abc][def]1abc2def3" should "return 6" in {
    assertResult(6) {
      StringCalculator.add("""//[abc][def]1abc2def3""")
    }
  }
}
