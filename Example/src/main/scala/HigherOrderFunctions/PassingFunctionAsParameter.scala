package HigherOrderFunctions

/**
  * Created by Aman on 11/13/2017.
  */
object PassingFunctionAsParameter {
  def main(args: Array[String]) = {
    functionExample(25, multiplyBy2)                   // Passing a function as parameter
  }
  def functionExample(a:Int, f:Int=>AnyVal):Unit = {
    println(f(a))                                   // Calling that function
  }
  def multiplyBy2(a:Int):Int = {
    a*2
  }
}
