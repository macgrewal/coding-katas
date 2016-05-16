package romanNum

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rob on 11/05/16.
  */
class RomanNumSpec extends FlatSpec with Matchers{

  "Calling RomanNum" should "return I for 1" in {
    assertResult("I") {
      RomanNum.get(1)
    }
  }

  it should "return II for 2" in {
    assertResult("II") {
      RomanNum.get(2)
    }
  }

  it should "return III for 3" in {
    assertResult("III") {
      RomanNum.get(3)
    }
  }

  it should "return IV for 4" in {
    assertResult("IV") {
      RomanNum.get(4)
    }
  }

  it should "return V for 5" in {
    assertResult("V") {
      RomanNum.get(5)
    }
  }

  it should "return VI for 6" in {
    assertResult("VI") {
      RomanNum.get(6)
    }
  }

  it should "return VII for 7" in {
    assertResult("VII") {
      RomanNum.get(7)
    }
  }
}
