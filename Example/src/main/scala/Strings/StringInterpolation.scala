package Strings

/**
  * Created by Aman on 11/6/2017.
  */
object StringInterpolation {
  def main(args: Array[String]) {
    val name = "James"

    println(s"Hello, $name")
    println(s"1 + 1 = ${1 + 1}")

    println(s"Hello, $name")
    //output: Hello, James

    val height = 1.9d
    println(f"$name%s is $height%2.2f meters tall") //James is 1.90 meters tall
  }
}
