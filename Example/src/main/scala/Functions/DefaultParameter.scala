package Functions

/**
  * Created by Aman on 11/6/2017.
  */
object DefaultParameter {
  def main(args: Array[String]) {
    println( "Returned Value : " + addInt() )
    println( "Returned Value : " + addInt(6, 9) )

  }

  def addInt( a:Int = 5, b:Int = 7 ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }
}
