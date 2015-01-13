package vn.com.vndirect.scala

import org.junit.Assert._
import org.junit.Before
import org.junit.Test

class HelloScalaJUnitTest {
  @Before
  def setup = println("Setup HelloScalaJUnit ")

  @Test
  def testAssert = assertTrue(true);

  
}