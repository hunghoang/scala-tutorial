package vn.com.vndirect.scala

import scala.beans.BeanProperty

import com.fasterxml.jackson.annotation.JsonProperty

class Person(@BeanProperty val name : String, @BeanProperty val age : Int) {

}