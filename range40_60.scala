// Write a Scala program to check whether two given integers are in the range 40..50 inclusive, or they are both in the range 50..60 inclusive.

object range40_60 {
    def range40_60(a: Int, b: Int): Boolean = {
        (a >= 40 && a <= 50 && b >= 40 && b <= 50) || (a >= 50 && a <= 60 && b >= 50 && b <= 60)
    }

    def main(args: Array[String]): Unit = {
        println(range40_60(45, 55))
        println(range40_60(45, 65))
        println(range40_60(45, 45))
        println(range40_60(55, 45))
    }
}