package vn.com.vndirect.scala

import org.scalatest.FunSuite
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._
import org.scalatest.BeforeAndAfter

trait Moveable {
  def move: Int
}

class MockitoTest extends FunSuite with MockitoSugar with BeforeAndAfter {

	val mockObject = mock[Moveable]
  before {
    when(mockObject.move).thenReturn(5);
  }
  
  
  test("Test trait with Mockito return int value") {
    val move = mockObject.move;
    assert(move == 5)
  }

}