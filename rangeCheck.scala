// Write a Scala program to check two given integers whether either of them is in the range 100..200 inclusive

object rangeCheck {
    def rangeCheck(a: Int, b: Int): Boolean = {
        if ((a >= 100 && a <= 200) || (b >= 100 && b <= 200)) {
            return true
        } else {
             return false
        }
    }

    def main(args: Array[String]): Unit = {
        println(rangeCheck(100, 200))
        println(rangeCheck(300, 200))
        println(rangeCheck(100, 300))
        println(rangeCheck(300, 400))
    }
}