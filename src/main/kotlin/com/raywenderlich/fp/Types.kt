package com.raywenderlich.fp

fun double(value: Int): Int = value * 2

fun square(value: Int): Int = value * value

typealias IntFun = (Int) -> Int

typealias Fun<A, B> = (A) -> B

fun main() {
  var myIntFunc: Fun<Int, Int> = ::double
  // 1
  println(myIntFunc(3))
  myIntFunc = ::square
  // 2
  println(myIntFunc(3))
}
