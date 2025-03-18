package Testing

import org.scalatest.{FlatSpec, Matchers}

/*
  * Created by Aman on 12/3/2017.
  */
class Example1Test extends FlatSpec with Matchers {

  "Example1" should "Divide 2 numbers" in {
    Example1.divide(10, 5) should be (2)
  }

  it should "throw ArithmeticException if attempted to divide by 0" in {
    a[ArithmeticException] should be thrownBy Example1.divide(8, 0)
  }

  it should "let adults vote" in {
    Example1.canVote(19) should be (true)
  }

  it should "not let minors vote" in {
    Example1.canVote(17) should be (false)
  }
}
