package com.raywenderlich.fp

interface Semigroup<T> {
  fun T.plus(rh: T): T
}

class SgValidationException(val messages: Array<String>):Semigroup<SgValidationException> {

override operator fun SgValidationException.plus(rh: SgValidationException) =
  SgValidationException(this.messages + messages)

}

