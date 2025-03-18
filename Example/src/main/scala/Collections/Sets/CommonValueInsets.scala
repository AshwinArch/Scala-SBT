package Collections.Sets

/**
  * Created by Aman on 11/6/2017.
  */
object CommonValueInsets {
  def main(args: Array[String]) {
    val num1 = Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)

    println( "Min element in Set(5,6,9,20,30,45) : " + num1.min )
    println( "Max element in Set(5,6,9,20,30,45) : " + num1.max )

    // find common elements between two sets
    println( "num1.&(num2) : " + num1.&(num2) )
    println( "num1.intersect(num2) : " + num1.intersect(num2) )
  }
}
