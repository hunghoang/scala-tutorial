package vn.com.vndirect.scala

import scala.collection.mutable.Buffer
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class ScalaTest {

  var index : Int = 0;
  
  @Before
  def setup = {
  	println("Setup scala test")
    index = 3  
  }
  
  @Test
  def testAssert = assertTrue(true);
  
  @Test
  def testVerifyIndex = assertEquals(3, index)
  
  
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
}