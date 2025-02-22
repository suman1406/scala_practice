// Write a Scala program to print "Hello, world" and version of the Scala language.
object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("Hello, world!")

        println("Scala Language: " + util.Properties.versionString)
    }
}