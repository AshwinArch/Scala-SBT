package Collections.Tuples

/**
  * Created by Aman on 11/6/2017.
  */
object Declarations {
  def main(args: Array[String]) {
    val t1 = (1, "hello", Console)
    val t2 = new Tuple3(1, "hello", Console)
    val t3 = (4,3,2,1)
    val t = (4,3,2,1)
    val sum = t._1 + t._2 + t._3 + t._4

    println( "Sum of elements: "  + sum )
  }

}
