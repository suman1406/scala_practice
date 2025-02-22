// Write a Scala program to check whether a given string starts with 'Sc' or not.

object checkStart {
    def checkStart(str: String): Boolean = {
        if (str.length() < 2) {
            return false
        }

        return str.substring(0, 2) == "Sc"
    }

    def main(args: Array[String]): Unit = {
        println(checkStart("Scala"))
        println(checkStart("Java"))
    }
}