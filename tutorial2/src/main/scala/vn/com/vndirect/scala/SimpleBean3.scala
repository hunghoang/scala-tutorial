package vn.com.vndirect.scala

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Autowired

@Component
class SimpleBean3 @Autowired()(var bean : SimpleBean, var bean2 : SimpleBean2) {

  @PostConstruct
  def init {
    println("Post construct for " + this + ", autowired beans in constructor: " + bean + " - " + bean2)
  }
}