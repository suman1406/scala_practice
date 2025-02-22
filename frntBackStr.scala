// Write a Scala program to create a new string with the last char added at the front and back of a given string of length 1 or more.

object frntBackStr {
    def frntBackStr(str: String): String = {
        if (str.length() == 1) {
            return str + str + str
        } else {
            return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1)
        }
    }

    def main(args: Array[String]): Unit = {
        println(frntBackStr("Scala"))
        println(frntBackStr("S"))
        println(frntBackStr("Sc"))
    }
}