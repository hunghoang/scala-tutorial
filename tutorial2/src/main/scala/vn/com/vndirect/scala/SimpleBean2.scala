package vn.com.vndirect.scala

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Autowired

@Component
class SimpleBean2 {

  @Autowired
  var simpleBean : SimpleBean = _
  
  println("Constructor of new bean " + this)
  
  @PostConstruct
  def init {
    println("Post construct for " + this + " autowired bean: " + simpleBean)
  }
}