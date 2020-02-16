package com.raywenderlich.fp.rweither.bifunctor

import arrow.Kind
import arrow.typeclasses.Conested
import arrow.typeclasses.Functor
import com.raywenderlich.fp.ForRwEither
import com.raywenderlich.fp.RwEither
import com.raywenderlich.fp.RwEither.Companion
import com.raywenderlich.fp.RwEitherFunctor
import kotlin.Function1
import kotlin.PublishedApi
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * cached extension
 */
@PublishedApi()
internal val bifunctor_singleton: RwEitherFunctor = object : com.raywenderlich.fp.RwEitherFunctor {}

@JvmName("bimap")
@Suppress(
    "UNCHECKED_CAST",
    "USELESS_CAST",
    "EXTENSION_SHADOWED_BY_MEMBER",
    "UNUSED_PARAMETER"
)
fun <A, B, C, D> Kind<Kind<ForRwEither, A>, B>.bimap(arg1: Function1<A, C>, arg2: Function1<B, D>):
    RwEither<C, D> = com.raywenderlich.fp.RwEither.bifunctor().run {
  this@bimap.bimap<A, B, C, D>(arg1, arg2) as com.raywenderlich.fp.RwEither<C, D>
}

@JvmName("lift")
@Suppress(
    "UNCHECKED_CAST",
    "USELESS_CAST",
    "EXTENSION_SHADOWED_BY_MEMBER",
    "UNUSED_PARAMETER"
)
fun <A, B, C, D> lift(arg0: Function1<A, C>, arg1: Function1<B, D>):
    Function1<Kind<Kind<ForRwEither, A>, B>, Kind<Kind<ForRwEither, C>, D>> =
    com.raywenderlich.fp.RwEither
   .bifunctor()
   .lift<A, B, C, D>(arg0, arg1) as
    kotlin.Function1<arrow.Kind<arrow.Kind<com.raywenderlich.fp.ForRwEither, A>, B>,
    arrow.Kind<arrow.Kind<com.raywenderlich.fp.ForRwEither, C>, D>>

@JvmName("mapLeft")
@Suppress(
    "UNCHECKED_CAST",
    "USELESS_CAST",
    "EXTENSION_SHADOWED_BY_MEMBER",
    "UNUSED_PARAMETER"
)
fun <A, B, C> Kind<Kind<ForRwEither, A>, B>.mapLeft(arg1: Function1<A, C>): RwEither<C, B> =
    com.raywenderlich.fp.RwEither.bifunctor().run {
  this@mapLeft.mapLeft<A, B, C>(arg1) as com.raywenderlich.fp.RwEither<C, B>
}

@JvmName("rightFunctor")
@Suppress(
    "UNCHECKED_CAST",
    "USELESS_CAST",
    "EXTENSION_SHADOWED_BY_MEMBER",
    "UNUSED_PARAMETER"
)
fun <X> rightFunctor(): Functor<Kind<ForRwEither, X>> = com.raywenderlich.fp.RwEither
   .bifunctor()
   .rightFunctor<X>() as arrow.typeclasses.Functor<arrow.Kind<com.raywenderlich.fp.ForRwEither, X>>

@JvmName("leftFunctor")
@Suppress(
    "UNCHECKED_CAST",
    "USELESS_CAST",
    "EXTENSION_SHADOWED_BY_MEMBER",
    "UNUSED_PARAMETER"
)
fun <X> leftFunctor(): Functor<Conested<ForRwEither, X>> = com.raywenderlich.fp.RwEither
   .bifunctor()
   .leftFunctor<X>() as
    arrow.typeclasses.Functor<arrow.typeclasses.Conested<com.raywenderlich.fp.ForRwEither, X>>

@JvmName("leftWiden")
@Suppress(
    "UNCHECKED_CAST",
    "USELESS_CAST",
    "EXTENSION_SHADOWED_BY_MEMBER",
    "UNUSED_PARAMETER"
)
fun <AA, B, A : AA> Kind<Kind<ForRwEither, A>, B>.leftWiden(): RwEither<AA, B> =
    com.raywenderlich.fp.RwEither.bifunctor().run {
  this@leftWiden.leftWiden<AA, B, A>() as com.raywenderlich.fp.RwEither<AA, B>
}

@Suppress(
    "UNCHECKED_CAST",
    "NOTHING_TO_INLINE"
)
inline fun Companion.bifunctor(): RwEitherFunctor = bifunctor_singleton