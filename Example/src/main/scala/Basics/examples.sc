def call(a: Array[Int], b: Array[Int]): List[Int] = {
  var listOut = List.empty

  if (a.length == b.length)
   for (x <- 0 until a.length)
     listOut :+ a(x) :+ b(x)
  else
    for (x <- 0 until a.length)
      listOut :+ a(x) :+ b(x)
    listOut :+ b(b.length-1)
  listOut
}


def solution(a: Int): List[Int]= {
  val inp = a.toString.map(_.asDigit).toArray
  val splitList = inp.splitAt(inp.length/2)
  val arr1: Array[Int] = splitList._1
  val arr2: Array[Int] = splitList._2.reverse

  call(arr1, arr2)
}


solution(123456)