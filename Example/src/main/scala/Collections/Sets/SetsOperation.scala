package Collections.Sets

/**
  * Created by Aman on 11/6/2017.
  */
object SetsOperation {
  def main(args: Array[String]) {
    val fruit = Set("apples", "oranges", "pears")
    val nums: Set[Int] = Set()

    println( "Head of fruit : " + fruit.head )
    println( "Tail of fruit : " + fruit.tail )
    println( "Check if fruit is empty : " + fruit.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )
  }
}
