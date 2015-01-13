package vn.com.vndirect.scala

import org.scalatest.FunSuite
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._
import org.scalatest.BeforeAndAfter


class BMWTest extends FunSuite with MockitoSugar with BeforeAndAfter {

  var bmw : BMW = _
  before {
    bmw = new BMW
  }
  
  test("Test bmw with self type annotation: check bmw call run and move method in trait") {
    var travel = bmw.travel(200)
    assert(230 == travel)
  }
  
}