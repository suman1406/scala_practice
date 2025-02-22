// Write a Scala program to remove the character in a given position of a given string. The given position will be in the range 0...string length -1 inclusive.

object removeChar {
    def removeChar(n: Int, str: String): String = {
        str.substring(0, n) + str.substring(n + 1)
    }

    def main(args: Array[String]): Unit = {
        println(removeChar(3, "Python"))
        println(removeChar(0, "Python"))
        println(removeChar(5, "Python"))
    }
}