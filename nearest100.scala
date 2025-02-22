// Write a Scala program to check which number is nearest to the value 100 among two given integers. Return 0 if the two numbers are equal.

object nearest100 {
    def nearest100(a: Int, b: Int): Int = {
        if (a == b) {
            return 0
        } else if (Math.abs(100 - a) < Math.abs(100 - b)) {
            return a
        } else {
            return b
        }
    }

    def main(args: Array[String]): Unit = {
        println(nearest100(90, 89))
        println(nearest100(90, 90))
        println(nearest100(90, 91))
    }
}