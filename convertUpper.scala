// Write a Scala program to convert the last 4 characters of a given string in upper case. If the length of the string has less than 4 then uppercase all the characters.

object convertUpper {
    def convertUpper(str: String): String = {
        if (str.length() < 4) {
            return str.toUpperCase()
        } else {
            return str.substring(0, str.length() - 4) + str.substring(str.length() - 4).toUpperCase()
        }
    }

    def main(args: Array[String]): Unit = {
        println(convertUpper("hello"))
        println(convertUpper("world"))
        println(convertUpper("scala"))
        println(convertUpper("java"))
    }
}