package com.raywenderlich.fp

import arrow.higherkind

/*
sealed class RwEither<out A, out B>
class RwLeft<out A>(val a: A) : RwEither<A, Nothing>()
class RwRight<out B>(val b: B) : RwEither<Nothing, B>()
 */

// 1
@higherkind
// 2
sealed class RwEither<out A, out B>: RwEitherOf<A,B> {
  // 3
  companion object
}
class RwLeft<out A>(val a: A) : RwEither<A, Nothing>()
class RwRight<out B>(val b: B) : RwEither<Nothing, B>()


fun intConverterWithEither(str: String): RwEither<NumberFormatException, Int> =
  try {
    val intValue = str.toInt()
    RwRight(intValue)
  } catch (nfe: NumberFormatException) {
    RwLeft(nfe)
  }
