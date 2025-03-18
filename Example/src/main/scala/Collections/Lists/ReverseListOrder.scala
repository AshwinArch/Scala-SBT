package Collections.Lists

/**
  * Created by Aman on 11/6/2017.
  */
object ReverseListOrder {
  def main(args: Array[String]) {
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))

    println( "Before reverse fruit : " + fruit )
    println( "After reverse fruit : " + fruit.reverse )
  }
}