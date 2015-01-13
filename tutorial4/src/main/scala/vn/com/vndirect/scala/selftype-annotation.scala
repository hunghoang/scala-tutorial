package vn.com.vndirect.scala


trait Moveable {
  def move() : Int = {
    println("This object is moving")
    10
  }
}


trait Plane {
  this: Moveable =>
  def fly(distance: Int) : Int = {
    println("This plane is flying")
    distance + move();
  }  
}


trait Runable {
  def run() : Int = {
    println("This object is running")
    20
  }  
}


trait Car {
  this: Moveable with Runable =>
    def travel(distance : Int) : Int = {
      println("This car is traveling") 
      distance + move() + run()
    }
}