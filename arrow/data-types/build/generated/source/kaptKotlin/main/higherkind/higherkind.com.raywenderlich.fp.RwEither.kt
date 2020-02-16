package com.raywenderlich.fp

class ForRwEither private constructor() { companion object }
typealias RwEitherOf<A, B> = arrow.Kind2<ForRwEither, A, B>
typealias RwEitherPartialOf<A> = arrow.Kind<ForRwEither, A>

@Suppress("UNCHECKED_CAST", "NOTHING_TO_INLINE")
inline fun <A, B> RwEitherOf<A, B>.fix(): RwEither<A, B> =
  this as RwEither<A, B>
