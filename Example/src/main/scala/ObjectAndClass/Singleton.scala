package ObjectAndClass

/**
  * Created by Aman on 11/13/2017.
  */
object Singleton{
  def main(args:Array[String]){
    SingletonObject.hello()         // No need to create object.
  }
}

object SingletonObject{
  def hello(){
    println("Hello, This is Singleton Object")
  }
}
