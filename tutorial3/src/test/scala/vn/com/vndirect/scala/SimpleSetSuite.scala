package vn.com.vndirect.scala

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.Matchers

class SimpleSetSuite extends FunSuite with BeforeAndAfter with Matchers {
  
  var setup = false
  before {
    setup = true
  }
  
  test("Map will filter value > 0") {
    var map = Map("a" -> 1, "b" -> 2, "c" -> -1);
    var map2 = map.filter((kv) => kv._2 > 0);
    assert(setup)
    assert(map2.size == 2)
    assert(map2.contains("a"))
    assert(map2.contains("b"))
    assert(!map2.contains("c"))
  }
  
  test("Map will filter value > 0 using matcher") {
    var map = Map("a" -> 1, "b" -> 2, "c" -> -1);
    var map2 = map.filter((kv) => kv._2 > 0);
    setup shouldBe true
    assert(map2.size == 2)
    map2 shouldEqual Map("a" -> 1, "b" -> 2)
    map2 should not contain("c")
  }
}