package com.raywenderlich.fp

// 1
interface Semigroup<T> {
  operator fun plus(rh: T): T
}

// 2
class SgValidationException(val messages: Array<String>) : Semigroup<SgValidationException> {
  // 3
  override operator fun plus(rh: SgValidationException) =
    SgValidationException(this.messages + rh.messages)
}

