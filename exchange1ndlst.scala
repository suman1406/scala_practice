// Write a Scala program to exchange the first and last characters in a given string and return the new string.

object exchange1ndlst {
    def exchange1ndlst(str: String): String = {
        str.charAt(str.length - 1) + str.substring(1, str.length - 1) + str.charAt(0)
    }

    def main(args: Array[String]): Unit = {
        println(exchange1ndlst("Python"))
        println(exchange1ndlst("Scala"))
        println(exchange1ndlst("Java"))
    }
}