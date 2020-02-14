package com.raywenderlich.fb

import arrow.core.EitherOf
import arrow.higherkind

// 1
@higherkind
// 2
sealed class Either<out A, out B> : EitherOf<A, B> {
  // 3
  companion object
}

class Left<A>(val a: A) : Either<A, Nothing>()
class Right<B>(val b: B) : Either<Nothing, B>()