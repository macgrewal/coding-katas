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

  it should "return IX for 9" in {
    assertResult("IX") {
      RomanNum.get(9)
    }
  }

  it should "return XIX for 19" in {
    assertResult("XIX") {
      RomanNum.get(19)
    }
  }

  it should "return XLIX for 49" in {
    assertResult("XLIX") {
      RomanNum.get(49)
    }
  }

  it should "return MDCCCLXXXVIII for 1888" in {
    assertResult("MDCCCLXXXVIII") {
      RomanNum.get(1888)
    }
  }

  it should "return MCMXCIX for 1999" in {
    assertResult("MCMXCIX") {
      RomanNum.get(1999)
    }
  }
}
