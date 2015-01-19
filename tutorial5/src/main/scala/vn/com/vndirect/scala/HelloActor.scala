package vn.com.vndirect.scala

import akka.actor.Actor

class HelloActor extends Actor {

  override def receive = {
    case "test" => println("Receive test")
    case message : String => println("Receive message: " + message)
    case _ => println("Receive unknown message")
  }
  
  
}