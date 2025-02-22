// Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.

object Check30 {
    def check30(a: Int, b: Int): Boolean = {
        if (a == 30 || b == 30 || a + b == 30) {
            true
        } else {
            false
        }
    }

    def main(args: Array[String]): Unit = {
        println(check30(30, 30))
        println(check30(30, 0))
        println(check30(25, 5))
    }
}