package com.raywenderlich.fb

sealed class Either<out A, out B>

class Left<A>(val a: A) : Either<A, Nothing>()
class Right<B>(val b: B) : Either<Nothing, B>()

// 1
fun intConverterWithEither(str: String): Either<NumberFormatException, Int> =
  try {
    val intValue = str.toInt()
    // 2
    Right(intValue)
  } catch (nfe: NumberFormatException) {
    // 3
    Left(nfe)
  }