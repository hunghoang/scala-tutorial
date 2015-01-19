package vn.com.vndirect.scala

import akka.actor.ActorSystem
import akka.actor.Props

object System extends App {
  override def main(args: Array[String]): Unit = {
    val system: ActorSystem = ActorSystem("testsystem")
    val myactor = system.actorOf(Props[HelloActor], "myactor");
    for(i <- 0 to 10) {
      myactor ! "hello " + i
    }
    system.shutdown()
  }
}