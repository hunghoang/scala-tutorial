package vn.com.vndirect.scala.rest

import scala.util.Random

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import vn.com.vndirect.scala.Person

@RestController
@RequestMapping(Array("/person"))
class RestServiceScala {
  
  @RequestMapping(value=Array("/random/{name}"))
  def getPerson(@PathVariable name : String): Person = {
    var age : Int = new Random().nextInt(100)
    println("get person with name: " + name)
    return new Person(name, age);
  }
}