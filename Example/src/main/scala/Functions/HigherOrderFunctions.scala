package Functions

/**
  * Created by Aman on 11/6/2017.
  */
object HigherOrderFunctions {
  def main(args: Array[String]) {
    println( apply( layout, 10) )
    println(userDir)
  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"

  var userDir = () => { System.getProperty("user.dir") }
}
