package vn.com.vndirect.scala

import scala.collection.mutable.Buffer
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class ScalaTest {

  @Before
  def setup = println("Setup scala test junit ")
  
  @Test
  def testAssert = assertTrue(true);
  
  @Test
  def testLengthOfList() {
    var list : List[String] = List("item1", "item2", "item3")
    assertEquals(3, list.length)
    var buffer = Buffer("A", "B", "C")
    assertEquals(3, buffer.length)
    
    buffer += "D"
    assertEquals(4, buffer.length)
    
    list = list :+ "item4"
    assertEquals(4, list.length)
  }
  
  @Test
  def testMap() {
    var map = Map("key1" -> "value1", "key2" -> "value2");
    assertEquals(2, map.size)
    assertEquals("value1", map.get("key1").get)
    assertEquals("value2", map.get("key2").get)
    assertEquals("value3", map.getOrElse("key3", "value3"))
    map += "key4" -> "value4"
    assertEquals(3, map.size)
  }
  
  def passMethod(m: () => Int): Int = {
    var result = m()
    return result + 1
  }
  
  def getAge() : Int = {
     10 
  }
  
  @Test 
  def testPassMethod() {
    var passMethodValue = passMethod {getAge}
    assertEquals(11, passMethodValue)
  }
  
}