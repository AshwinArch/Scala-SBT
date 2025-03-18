package HigherOrderFunctions

/**
  * Created by Aman on 11/13/2017.
  */
object NestedFunctions {
  def add(a:Int, b:Int, c:Int) = {
    def add2(x:Int,y:Int) = {
      x+y
    }
    add2(a,add2(b,c))
  }
  def main(args: Array[String]) = {
    var result = add(10,10,10)
    println(result)
  }
}
