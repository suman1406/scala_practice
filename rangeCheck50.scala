// Write a Scala program to check whether three given integer values are in the range 20..50 inclusive. Return true if 1 or more of them are in the said range otherwise false.

object rangeCheck50 {
  def main(args: Array[String]): Unit = {
    println("Enter three numbers: ")
    val num1 = scala.io.StdIn.readInt()
    val num2 = scala.io.StdIn.readInt()
    val num3 = scala.io.StdIn.readInt()

    if (num1 >= 20 && num1 <= 50 || num2 >= 20 && num2 <= 50 || num3 >= 20 && num3 <= 50) {
      println("True")
    } else {
      println("False")
    }
  }
}