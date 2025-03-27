// Question:
// As part of a data processing pipeline, complete the implementation.
// The makePipeline function should accept a variable number of functions, and return 
// a new function that accepts one parameter 'arg'.
// The returned function should call the first function in makePipeline with 'arg', then pass 
// its result to the second function, and so on, in order, returning the result from the last function.
// For example, calling makePipeline(
//     (x: Int) => x * 3, 
//     (x: Int) => x + 1, 
//     (x: Int) => x / 2
// ) with argument 3 should return 5  (because 3*3=9, 9+1=10, 10/2=5).

object Pipeline {
    def makePipeline[A](functions: (A => A)*): A => A = { arg =>
        functions.foldLeft(arg)((acc, f) => f(acc))
    }

    def main(args: Array[String]): Unit = {
        val pipeline = makePipeline[Int](
            (x: Int) => x * 3,
            (x: Int) => x + 1,
            (x: Int) => x / 2
        )
        val input = 3
        val result = pipeline(input)
        println(s"Pipeline result for input $input: $result")
    }
}