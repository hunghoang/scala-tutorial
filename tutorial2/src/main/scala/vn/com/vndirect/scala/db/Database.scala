package vn.com.vndirect.scala.db

import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Value
import javax.annotation.PostConstruct

@Component
class Database {

  @Value("${db.host}")
  var host : String = _
  
  
  @Value("${db.port}")
  var port : Int = _
  
  @PostConstruct
  def init = println("db host: " + host + ":" + port)
}