package HigherOrderFunctions

/**
  * Created by Aman on 11/13/2017.
  */
object AnonymousFunction {
  def main(args: Array[String]) = {
    var result1 = (a:Int, b:Int) => a+b        // Anonymous function by using => (rocket)
    var result2 = (_:Int)+(_:Int)              // Anonymous function by using _ (underscore) wild card
    println(result1(10,10))
    println(result2(10,10))
  }
}