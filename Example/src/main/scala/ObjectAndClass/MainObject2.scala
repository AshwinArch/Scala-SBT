package ObjectAndClass

/**
  * Created by Aman on 11/13/2017.
  */
class Student2(id:Int, name:String){
  def getRecord(){
    println(id+" "+name);
  }
}

object MainObject2{
  def main(args: Array[String]){
    var student1 = new Student2(101,"Raju");
    var student2 = new Student2(102,"Martin");
    student1.getRecord();
    student2.getRecord();
  }
}
