package Functions

/**
  * Created by Aman on 11/6/2017.
  */
object FunctionWithVariableArguments {
  def main(args: Array[String]) {
    printStrings("Hello", "Scala", "Python");
  }

  def printStrings( args:String* ) = {
    var i : Int = 0

    for( arg <- args ){
      println("Arg value[" + i + "] = " + arg );
      i = i + 1
    }
  }
}
