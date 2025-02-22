// Write a Scala program to create a new string taking the first 3 characters of a given string and return the string with the 3 characters added at both the front and back. If the given string length is less than 3, use whatever characters are there.

object frntback3 {
    def frntback3 (str: String): String = {
        if (str.length() < 3) {
            return str + str + str
        } else {
            val front = str.substring(0, 3)
            return front + str + front
        }
    }

    def main(args: Array[String]): Unit = {
        println(frntback3("abc"))
        println(frntback3("ab"))
        println(frntback3("a"))
    }
}