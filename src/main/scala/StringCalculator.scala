object StringCalculator {
  def add(input: String): Int =
    """(?<=\[).+?(?=\])""".r //Creating a regex pattern to get all of the delimiters
      .findAllIn(input) //Find all delimiters in input
      .map(_.replaceAll("\\*", "\\*")) //Escape the special regex characters
      .++(Seq(",", "\n")) //Add the predefined delimiters
      .foldLeft(Seq(input.replaceAll("""\[|\]""", "")))((strings, regex) => strings.flatMap(_.split(regex))) //Split the input by each of the delimiters
      .collect { case string if string.matches("\\d+") => string.toInt } //Convert the strings that contain numbers into integers
      .sum //Add them all together
}