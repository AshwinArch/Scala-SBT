package Collections.Lists

/**
  * Created by Aman on 11/6/2017.
  */
object CreatingUniformLists {
  def main(args: Array[String]) {
    val fruit = List.fill(3)("apples") // Repeats apples three times.
    println( "fruit : " + fruit  )

    val num = List.fill(10)(2)         // Repeats 2, 10 times.
    println( "num : " + num  )
  }
}
