// Write a Scala program to get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference

object AbsDiff {
    def absDiff (n: Int): Int = {
        if (n > 51) {
            3 * (n - 51)
        } else {
            51 - n
        }
    }

    def main(args: Array[String]): Unit = {
        println(absDiff(53))
        println(absDiff(30))
    }
}