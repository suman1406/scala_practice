// Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300.

object percent20 {
    def percent20(n: Int): Boolean = {
        return (Math.abs(100 - n) <= 20) || (Math.abs(300 - n) <= 20)
    }

    def main(args: Array[String]): Unit = {
        println(percent20(100))
        println(percent20(200))
        println(percent20(300))
        println(percent20(400))
    }
}