package romanNum

/**
  * Created by rob on 11/05/16.
  */
object RomanNum {
  def get(i: Int) =
    values.foldLeft((i, "")) {
      case ((n, s), (k, v)) => (n % k, s + (v * (n / k)))
    }._2

  val values = Seq(
    1000 -> "M",
    900 -> "CM",
    500 -> "D",
    400 -> "CD",
    100 -> "C",
    90 -> "XC",
    50 -> "L",
    40 -> "XL",
    10 -> "X",
    9 -> "IX",
    5 -> "V",
    4 -> "IV",
    1 -> "I"
  )
}
