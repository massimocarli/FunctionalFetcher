package com.raywenderlich.fp

// 1
class ValidationException(msg: String) : Exception(msg)

//// 2
//fun validateName(name: String): Result<Exception, String> =
//  if (name.length > 4) Success(name) else Error(ValidationException("Invalid Name"))
//
//// 3
//fun validateEmail(email: String): Result<ValidationException, String> =
//  if (email.contains("@")) Success(email) else Error(ValidationException("Invalid email"))

fun validateName(name: String): Result<SgValidationException, String> =
  if (name.length > 4) Success(name)
  else Error(SgValidationException(arrayOf("Invalid Name")))

// 3
fun validateEmail(email: String): Result<SgValidationException, String> =
  if (email.contains("@")) Success(email)
  else Error(SgValidationException(arrayOf("Invalid email")))


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

  val userApp = justResult(userBuilder)

  val validatedUser = userApp appl idVal appl validateName("Max") appl validateEmail("maxcarli.it")
  validatedUser.bimap({
    it.messages.forEach {
      println("Error: $it")
    }
  }, {
    println("Validated user: $it")
  })
}

fun main2() {
  /*
  val idVal = justResult(1)
  val nameVal = justResult("Max")
  val missingName = Error(IllegalStateException("Missing name!"))
  val emailVal = justResult("max@maxcarli.it")
  val userApp = justResult(userBuilder)
  // 1
  (userApp appl idVal appl nameVal appl emailVal).map { println(it) }
  // 2
  (userApp appl idVal appl missingName appl emailVal).map { println(it) }

  val validatedUser = userApp appl idVal appl validateName("Massimo") appl validateEmail("max@maxcarli.it")
  validatedUser.map {
    println("Validated: $it")
  }
   */
}