package com.raywenderlich.fp

fun main() {
  val intConverter: Fun<String, Int> = String::toInt
  //val inputString = "21"
  val inputString = "NotANumber"
  println("The String \"$inputString\" contains the Int: ${intConverter(inputString)}")
  val error: Int = throw NumberFormatException("Something wring")
  println("You're here")
}