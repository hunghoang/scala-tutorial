package vn.com.vndirect.scala

import org.scalatest.FunSuite
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._
import org.scalatest.BeforeAndAfter

class BoeingTest extends FunSuite with MockitoSugar with BeforeAndAfter {

  var boeing: Boeing = _

  before {
    boeing = new Boeing()
  }

  test("Test self type annotation of plane return number") {
    val distance = boeing.fly(25);
    assert(distance == 35)
    val distance2 = boeing.fly(35);
    assert(distance2 == 45)
  }

}