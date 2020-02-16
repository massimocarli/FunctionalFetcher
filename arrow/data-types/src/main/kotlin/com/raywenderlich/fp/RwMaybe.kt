package com.raywenderlich.fp

sealed class RwMaybe<out A>
class RwSome<out A>(val value: A) : RwMaybe<A>()
object RwNone : RwMaybe<Nothing>()

// Functor implementation
fun <A, B> RwMaybe<A>.map(fn: (A) -> B): RwMaybe<B> = when (this) {
  is RwSome<A> -> RwSome(fn(this.value))
  else -> RwNone
}

// Applicative implementation
fun <A> just(value: A): RwMaybe<A> = RwSome(value)

fun <A, B> RwMaybe<A>.ap(fn: RwMaybe<(A) -> B>): RwMaybe<B> =
  if (this is RwNone || fn is RwNone) RwNone
  else RwSome((fn as RwSome<(A) -> B>).value((this as RwSome<A>).value))

infix fun <A, B> RwMaybe<(A) -> B>.appl(a: RwMaybe<A>) = a.ap(this)