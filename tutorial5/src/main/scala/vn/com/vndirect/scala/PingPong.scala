package vn.com.vndirect.scala

import akka.actor.ActorRef
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

case object StartMessage
case object PingMessage
case object PongMessage


class Ping(pong : ActorRef) extends Actor {
  def receive = {
    case StartMessage =>
      println("Start send ping message")
      pong ! PingMessage
    case PongMessage =>
      println(" Pong message")
      pong ! PingMessage  
    case _ => println("Unexpected message")
  }
}

class Pong extends Actor {
  def receive = {
    case PingMessage =>
      println(" Ping message")
      sender() ! PongMessage  
    case _ => println("Unexpected message")
  }
}

object PingPongTest extends App {
  var system = ActorSystem("PingPongSystemTest")
  val pong = system.actorOf(Props[Pong], name = "Pong")
  val ping = system.actorOf(Props(new Ping(pong)), name = "Ping")
  ping ! StartMessage
  system.shutdown()
}