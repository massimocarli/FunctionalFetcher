package com.raywenderlich.fp

data class User(val id: Int, val name: String, val email: String)

val userBuilder: UserBuilder = { id: Int -> { name: String -> { email: String -> User(id, name, email) } } }

typealias UserBuilder = (Int) -> (String) -> (String) -> User

// 1
fun validateName(name: String): RwMaybe<String> = if (name.length > 4) RwSome(name) else RwNone

// 2
fun validateEmail(email: String): RwMaybe<String> = if (email.contains("@")) RwSome(email) else RwNone


//fun main() {
//  val idVal = just(1)
//  val missingName = RwNone // HERE
//  val emailVal = just("max@maxcarli.it")
//  val userApp = just(userBuilder)
//  emailVal.ap(missingName.ap(idVal.ap(userApp))).map { println(it) }
//}

fun main() {
  val idVal = just(1)
  val nameVal = just("Max")
  val missingName = RwNone
  val emailVal = just("max@maxcarli.it")
  val userApp = just(userBuilder)
  // 1
  (userApp appl idVal appl nameVal appl emailVal).map { println(it) }
  // 2
  (userApp appl idVal appl missingName appl emailVal).map { println(it) }

  val validatedUser = userApp appl idVal appl validateName("Massimo") appl validateEmail("max@maxcarli.it")
  validatedUser.map {
    println("Validated: $it")
  }
}