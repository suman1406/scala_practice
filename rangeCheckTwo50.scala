// Write a Scala program to check whether two given integer values are in the range 20..50 inclusive. Return true if 1 or other is in the said range otherwise false.

object rangeCheckTwo50 {
    def rangeCheckTwo50(a: Int, b: Int): Boolean = {
        if ((a >= 20 && a <= 50) || (b >= 20 && b <= 50)) {
            return true
        } else {
            return false
        }
    }

    def main(args: Array[String]): Unit = {
        println(rangeCheckTwo50(20, 30))
        println(rangeCheckTwo50(20, 50))
        println(rangeCheckTwo50(20, 51))
        println(rangeCheckTwo50(10, 30))
    }
}