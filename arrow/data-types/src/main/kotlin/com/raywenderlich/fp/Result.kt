package com.raywenderlich.fp

/**
 * The Result data type
 */
sealed class Result<out E, out A> {
  companion object {
    fun <A> just(value: A) = Success(value)
  }
}

class Success<out A>(val a: A) : Result<Nothing, A>()
class Error<out E>(val e: E) : Result<E, Nothing>()

// The Result as Functor
fun <E, A, B> Result<E, A>.map(fn: (A) -> B): Result<E, B> = when (this) {
  is Success<A> -> Success(fn(this.a))
  is Error<E> -> this
}

// The Result as Applicative
infix fun <E, A, B> Result<E, A>.ap(fn: Result<E, (A) -> B>): Result<E, B> = when {
  this is Error<E> -> this
  fn is Error<E> -> Error(fn.e)
  else -> Success((fn as Success<(A) -> B>).a((this as Success<A>).a))
}

// Better syntax
infix fun <E, A, B> Result<E, (A) -> B>.appl(a: Result<E, A>) = a.ap(this)


