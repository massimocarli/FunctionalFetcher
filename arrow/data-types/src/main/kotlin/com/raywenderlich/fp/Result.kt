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

fun <A, B, E> Result<E, A>.ap(f: Result<E, (A) -> B>): Result<E, B> = when {
  this is Success<A> && f is Success<(A) -> B> -> Success((f.a)(this.a))
  else -> when {
    this is Error -> this
    else -> Error((f as Error<E>).e)
  }
}


fun main() {

}