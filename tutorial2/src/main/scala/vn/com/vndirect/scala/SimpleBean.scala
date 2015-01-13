package vn.com.vndirect.scala

import org.springframework.stereotype.Component

import javax.annotation.PostConstruct

@Component
class SimpleBean {
  
	println("Constructor of new bean " + this)
  
  def this(name: String) {
    this()
  }
  
  @PostConstruct
  def init {
    println("Post construct for " + this)
  }
}