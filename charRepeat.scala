// Write a Scala program to check whether a given character presents in a string between 2 to 4 times.

object charRepeat {
    def charRepeat(str: String, ch: Char): Boolean = {
        var count = 0
        for (i <- 0 until str.length) {
            if (str(i) == ch) {
                count += 1
            }
        }
        return count >= 2 && count <= 4
    }

    def main(args: Array[String]): Unit = {
        val str = "Hello, World!"
        val ch = 'l'
        println(charRepeat(str, ch))
    }
}