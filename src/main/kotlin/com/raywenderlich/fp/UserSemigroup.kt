package com.raywenderlich.fp

fun main() {
  val idVal = justResult(1)
  val userApp = justResult(userBuilder)
  val validatedUser = userApp appl idVal appl validateName("Max") appl validateEmail("maxcarli.it")
  validatedUser.bimap({
    println("Error: $it")
  }, {
    println("Validated user: $it")
  })
}