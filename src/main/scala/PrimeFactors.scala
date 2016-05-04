package primeFactors

object PrimeFactors {
  // credit for implementation goes to kabuumu
  def result(n: Int, l: List[Int] = Nil): List[Int] = {
    (2 to n)
      .find(n % _ == 0)
      .map(f => result(n / f, l.:+(f)))
      .getOrElse(l)
  }
}