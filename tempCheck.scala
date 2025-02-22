// Write a Scala program to check whether one of the given temperatures is less than 0 and the other is greater than 100.

object tempCheck {
    def tempCheck(temp1: Int, temp2: Int): Boolean = {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true
        } else {
            return false
        }
    }

    def main(args: Array[String]): Unit = {
        println(tempCheck(-1, 101))
        println(tempCheck(101, -1))
        println(tempCheck(-1, 99))
        println(tempCheck(99, -1))
    }
}