// Write a Scala program to check whether a string 'yt' appears at index 1 in a given string. If it appears return a string without 'yt' otherwise return the original string.

object checkyt {
    def checkyt(str: String): String = {
        if (str.length() < 2) {
            return str
        } else if (str.substring(1, 3) == "yt") {
            return str.substring(0, 1) + str.substring(3)
        } else {
            return str
        }
    }

    def main(args: Array[String]): Unit = {
        println(checkyt("Python"))
        println(checkyt("Jython"))
        println(checkyt("Pythonyt"))
    }
}