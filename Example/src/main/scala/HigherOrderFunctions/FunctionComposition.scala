package HigherOrderFunctions

/**
  * Created by Aman on 11/13/2017.
  */
object FunctionComposition {
  def main(args: Array[String]) = {
    var result = multiplyBy2(add2(10))      // Function composition
    println(result)
  }
  def add2(a:Int):Int = {
    a+2
  }

  def multiplyBy2(a:Int):Int = {
    a*2
  }
}
