package com.raywenderlich.fp

data class User(val id: Int, val name: String, val email: String)

val userBuilder: UserBuilder = { id: Int -> { name: String -> { email: String -> User(id, name, email) } } }

typealias UserBuilder = (Int) -> (String) -> (String) -> User


//fun main() {
//  val idVal = just(1)
//  val missingName = RwNone // HERE
//  val emailVal = just("max@maxcarli.it")
//  val userApp = just(userBuilder)
//  emailVal.ap(missingName.ap(idVal.ap(userApp))).map { println(it) }
//}

//fun main() {
//  // 1
//  val idVal = justResult(1)
//  //val nameVal = justResult("Max")
//  val missingName = Error(IllegalStateException("Missing name!"))
//  val emailVal = justResult("max@maxcarli.it")
//  // 2
//  val userApp = justResult(userBuilder)
//  // 3
//  emailVal.ap(missingName.ap(idVal.ap(userApp))).mapLeft {
//    println(it)
//  }
//}

fun main() {
  val idVal = justResult(1)
  val nameVal = justResult("Max")
  val missingNameVal = Error(IllegalStateException("Missing name!"))
  val emailVal = justResult("max@maxcarli.it")
  val userApp = justResult(userBuilder)
  // 1
  (userApp appl idVal appl nameVal appl emailVal).mapRight { println(it) }
  // 2
  (userApp appl idVal appl missingNameVal appl emailVal).mapLeft { println(it) }
}
