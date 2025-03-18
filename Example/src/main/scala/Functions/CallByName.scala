package Functions

/**
  * Created by Aman on 11/5/2017.
  */
object CallByName {
  def main(args: Array[String]) {
    DefTime(time())
  }

  def time(): Long ={
    println("In time method now")
    System.nanoTime()
  }

  def DefTime(i: => Long): Unit ={
    println("In defTime method now")
    println("the time is " + i)
  }
}
