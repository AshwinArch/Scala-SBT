package Functions

import java.util.Date

/**
  * Created by Aman on 11/5/2017.
  */
object PartiallyAppliedFunctions1 {

  def main(args: Array[String]) {
    val date = new Date
    log(date, "message1" )

    Thread.sleep(1000)
    log(date, "message2" )

    Thread.sleep(1000)
    log(date, "message3" )
  }

  def log(date: Date, message: String)  = {
    println(date + "----" + message)
  }
}