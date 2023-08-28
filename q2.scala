package Tutorial10

object q2 {
  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length)
    val tot = wordLengths.reduce(_ + _)
    tot
  }
  def main(args: Array[String]): Unit = {
    val input = List("apple", "banana", "cherry", "date")

    println("Total count of letter occurrences: " +countLetterOccurrences(input))
  }


}
