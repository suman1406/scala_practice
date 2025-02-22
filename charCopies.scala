// Write a Scala program to create a new string which is 4 copies of the 2 front characters of a given string.If the given string length is less than 2 return the original string.

object charCopies {
    def main(args: Array[String]): Unit = {
        println("Enter a string: ")
        val str = scala.io.StdIn.readLine()
        if (str.length() < 3) {
            println(str)
        } else {
            val front = str.substring(0, 2)
            println(front * 4)
        }
    }
}