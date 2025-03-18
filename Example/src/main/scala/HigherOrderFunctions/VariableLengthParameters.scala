package HigherOrderFunctions

/**
  * Created by Aman on 11/13/2017.
  */
object VariableLengthParameters {
  def main(args: Array[String]) {

    var sum = add(1,2,3,4,5,6,7,8,9);
    println(sum);
  }

  def add(args: Int*) = {
    var sum = 0;
    for(a <- args) sum+=a
    sum
  }
}
