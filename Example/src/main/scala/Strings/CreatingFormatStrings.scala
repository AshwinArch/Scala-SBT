package Strings

/**
  * Created by Aman on 11/6/2017.
  */
object CreatingFormatStrings {
  def main(args: Array[String]) {
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "Hello, Scala!"

    var fs = printf("The value of the float variable is " + "%f," +
      " \nwhile the value of the integer " + "variable is %d, \nand " +
      "the string " + "is %s", floatVar, intVar, stringVar);

    println(fs)


  }
}
