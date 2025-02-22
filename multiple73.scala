// Write a Scala program to check whether a given positive number is a multiple of 3 or a multiple of 7.

object multiple {
    def multiple(n: Int): Boolean = {
        if (n % 3 == 0 || n % 7 == 0) {
            return true
        } else {
            return false
        }
    }

    def main(args: Array[String]): Unit = {
        println(multiple(21))
        println(multiple(15))
        println(multiple(10))
    }
}