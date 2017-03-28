object FizzBuzz {
  def fizzBuzz(x: Int): String = (x % 3, x % 5) match {
    case (0, 0) => "fizzbuzz"
    case (0, _) => "fizz"
    case (_, 0) => "buzz"
    case _ => x.toString
  }
}
