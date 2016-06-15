object StringCalculator {
  def add(input: String): Int =
    """(?<=\[).+?(?=\])""".r
      .findAllIn(input)
      .foldLeft(Seq(",", "\n"))((a, b) => a.:+(b))
      .foldLeft(Seq(input.replaceAll("""\[|\]""", "")))((strings, regex) => strings.flatMap(_.split(regex.replaceAll("\\*", "\\*"))))
      .collect { case string if string.matches("\\d+") => string.toInt }
      .sum
}