package Collections.Lists

/**
  * Created by Aman on 11/6/2017.
  */
object TabulatingFunction {
  def main(args: Array[String]) {
    // Creates 5 elements using the given function.
    val squares = List.tabulate(6)(n => n * n)
    println( "squares : " + squares  )

    val mul = List.tabulate( 4,5 )( _ * _ )
    println( "mul : " + mul  )
  }
}
