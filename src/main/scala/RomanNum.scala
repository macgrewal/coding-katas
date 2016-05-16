package romanNum

/**
  * Created by rob on 11/05/16.
  */
object RomanNum {
  def get(i: Int): String = i%5 match {
    case _ if i <= 3 => (1 to i).foldLeft("")((s, i) => s + "I")
    case 4 => "IV"
    case 0 => "V"
    case 1 => "VI"
    case 2 => "VII"
  }
}
