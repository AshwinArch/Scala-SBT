package ObjectAndClass

/**
  * Created by Aman on 11/13/2017.
  */

class Arithmetic{
  def add(a:Int, b:Int){
    var add = a+b;
    println("sum = "+add);
  }
}

object AnonymousObject{
  def main(args:Array[String]){
    new Arithmetic().add(10,10);

  }
}