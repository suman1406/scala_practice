// Write a Scala program to create a new string where 'if' is added to the front of a given string. If the string already begins with 'if', return the string unchanged.

object addif {
    def addif(str: String): String = {
        if (str.startsWith("if")) str
        else "if" + str
    }

    def main(args: Array[String]): Unit = {
        println(addif("else"))
        println(addif("ifelse"))
    }
}