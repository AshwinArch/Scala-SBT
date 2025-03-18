package ObjectAndClass

/**
  * Created by Aman on 11/13/2017.
  */
class Student1(id:Int, name:String){     // Primary constructor
def show(){
  println(id+" "+name)
}
}
object MainObject1{
  def main(args:Array[String]){
    var s = new Student1(100,"Martin")   // Passing values to constructor
    s.show()                // Calling a function by using an object
  }
}
