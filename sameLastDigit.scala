// Write a Scala program to check whether two given positive integers have the same last digit.

object sameLastDigit {
    def sameLastDigit(x: Int, y: Int): Boolean = {
        return x % 10 == y % 10
    }

    def main(args: Array[String]): Unit = {
        println(sameLastDigit(12, 22))
        println(sameLastDigit(12, 32))
        println(sameLastDigit(12, 42))
    }
}