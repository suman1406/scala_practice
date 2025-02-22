// Write a Scala program to compute the sum of the two given integer values. If the two values are the same, then return triples their sum.

object Sum {

    def sum(a: Int, b: Int): Int = {
        if (a == b) {
            3 * (a + b)
        } else {
            a + b
        }
    }
    def main(args: Array[String]): Unit = {
        println("Result: " + sum(3, 5))

        println("Result: " + sum(5, 5))
    }
}