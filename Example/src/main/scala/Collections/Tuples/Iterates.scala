package Collections.Tuples

/**
  * Created by Aman on 11/6/2017.
  */
object Iterates {
  def main(args: Array[String]) {
    val t = (4,3,2,1)

    t.productIterator.foreach{ i =>println("Value = " + i )}
  }
}
