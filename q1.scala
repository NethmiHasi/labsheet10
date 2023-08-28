package Tutorial10

object q1 {

  def calculateAverage(temperature: List[Double]): Double = {
    val fahrenheitTemperatures = temperature.map(celcius => (celcius * 9 / 5) + 32)
    val tot = fahrenheitTemperatures.reduce(_ + _)
    val average = tot / temperature.length
    average
  }

  def main(args: Array[String]): Unit = {
    //val input = List(0.0, 10.0, 20.0, 30.0)

    println("Enter a list of temperatures separated by spaces:")
    val input = scala.io.StdIn.readLine().split(" ").map(_.toDouble).toList
    println("Average Fahrenheit temperature : " + calculateAverage(input))
  }



}
