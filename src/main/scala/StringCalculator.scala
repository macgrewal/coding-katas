object StringCalculator {
 def add(input: String): Int = input match {
   case "" => 0
   case _ => {
     val delimiters = Array(',', '\n')
     input.split(delimiters).foldLeft(0)(_ + _.toInt)
   }
 }
}
