// Write a Scala program to create a new string which is n (non-negative integer ) copies of a given string.

object newString {
    def newString(str: String, n: Int): String = {
        return str * n
    }

    def main(args: Array[String]): Unit = {
        println(newString("abc", 2))
        println(newString("abc", 3))
        println(newString("abc", 1))
    }
}