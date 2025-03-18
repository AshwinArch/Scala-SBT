package HigherOrderFunctions

/**
  * Created by Aman on 11/13/2017.
  */
object FunctionCurrying {
  def add(a:Int)(b:Int) = {
    a+b
  }
  def main(args: Array[String]) = {
    var result = add(10)(10)
    println("10 + 10 = "+result)
    var addIt = add(10)_
    var result2 = addIt(3)
    println("10 + 3 = "+result2)
  }
}
