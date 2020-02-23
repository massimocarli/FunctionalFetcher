package com.raywenderlich.fp

/**
 * Functor implementation on the Error
 */
fun <E1, E2, T> Result<E1, T>.mapLeft(fn: (E1) -> E2): Result<E2, T> = when (this) {
  is Success<T> -> this
  is Error<E1> -> Error(fn(this.e))
}

/**
 * Functor implementation on the Success
 */
fun <E, T, R> Result<E, T>.mapRight(fn: (T) -> R): Result<E, R> = when (this) {
  is Success<T> -> Success(fn(this.a))
  is Error<E> -> this
}

/**
 * Overload for the BiFunctor
 */
fun <E1, E2, T, R> Result<E1, T>.map(fe: (E1) -> E2, fs: (T) -> R): Result<E2, R> = when (this) {
  is Success<T> -> Success(fs(this.a))
  is Error<E1> -> Error(fe(this.e))
}