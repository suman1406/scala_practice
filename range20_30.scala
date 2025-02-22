// Write a Scala program to find the larger value from two positive integer values in the range 20..30 inclusive, or return 0 if neither is in that range.

object range20_30 {
    def range20_30(a: Int, b: Int): Int = {
        if ((a >= 20 && a <= 30) && (b >= 20 && b <= 30)) {
            if (a > b) a else b
        } else if (a >= 20 && a <= 30) {
            a
        } else if (b >= 20 && b <= 30) {
            b
        } else {
            0
        }
    }

    def main(args: Array[String]): Unit = {
        println(range20_30(25, 35))
        println(range20_30(35, 25))
        println(range20_30(25, 25))
    }
}