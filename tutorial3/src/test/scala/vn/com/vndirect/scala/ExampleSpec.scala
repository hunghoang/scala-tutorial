package vn.com.vndirect.scala

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import scala.collection.mutable.Stack

class ExampleSpec extends FlatSpec with Matchers {
  
  "A stack" should "pop values in first in last out order" in {
    var stack = new Stack[Int];
    stack.push(1);
    stack.push(2);
    stack.pop() should be (2)
    stack.pop() should be (1)
  }
  
  "A reversed List" should "reserve in right order" in {
    var list = List(1,2,3);
    list(0) should be (1)
    list(1) should be (2)
    list(2) should be (3)
    list = list.reverse
    list(0) should be (3)
    list(1) should be (2)
    list(2) should be (1)
  }
}