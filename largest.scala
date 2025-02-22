// Write a Scala program to check the largest number among three given integers.

object largest {
    def largestNumber(a: Int, b: Int, c: Int): Int = {
        if (a > b && a > c) {
            return a
        } else if (b > a && b > c) {
            return b
        } else {
            return c
        }
    }

    def main(args: Array[String]): Unit = {
        println(largestNumber(1, 2, 3))
        println(largestNumber(1, 3, 2))
        println(largestNumber(2, 1, 3))
        println(largestNumber(2, 3, 1))
        println(largestNumber(3, 1, 2))
        println(largestNumber(3, 2, 1))
    }
}