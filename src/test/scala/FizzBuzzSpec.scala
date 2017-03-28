import base.UnitSpec

class FizzBuzzSpec extends UnitSpec {

  "Calling fizzBuzz with 3" should {
    "return fizz" in {
      FizzBuzz.fizzBuzz(3) shouldBe "fizz"
    }
  }

  "Calling fizzBuzz with 1" should {
    "return 1" in {
      FizzBuzz.fizzBuzz(1) shouldBe "1"
    }
  }

  "Calling fizzBuzz with 5" should {
    "return buzz" in {
      FizzBuzz.fizzBuzz(5) shouldBe "buzz"
    }
  }

  "Calling fizzBuzz with 15" should {
    "return fizzbuzz" in {
      FizzBuzz.fizzBuzz(15) shouldBe "fizzbuzz"
    }
  }

  "Calling fizzBuzz with 30" should {
    "return fizzbuzz" in {
      FizzBuzz.fizzBuzz(30) shouldBe "fizzbuzz"
    }
  }

  "Calling fizzBuzz with 19" should {
    "return 19" in {
      FizzBuzz.fizzBuzz(19) shouldBe "19"
    }
  }
}
