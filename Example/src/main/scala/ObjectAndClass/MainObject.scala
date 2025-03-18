package ObjectAndClass

/**
  * Created by Aman on 11/13/2017.
  */
class Student{
  var id:Int = 0;                         // All fields must be initialized
  var name:String = null;
}
object MainObject{
  def main(args:Array[String]){
    var s = new Student()               // Creating an object
    println(s.id+" "+s.name);
  }
}
