package vn.com.vndirect.scala

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import scala.App
import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.PropertySource

@Configuration
@EnableAutoConfiguration
@ComponentScan
@PropertySource(Array("config/app.properties"))
class ScalaConfig

object ScalaApplication extends App {

  SpringApplication.run(classOf[ScalaConfig])
}