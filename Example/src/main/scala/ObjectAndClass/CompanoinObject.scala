package ObjectAndClass

/**
  * Created by Aman on 11/13/2017.
  */
class ComapanionClass{
  def hello(){
    println("Hello, this is Companion Class.")
  }
}
object CompanoinObject{
  def main(args:Array[String]){
    new ComapanionClass().hello()
    println("And this is Companion Object.")
  }
}