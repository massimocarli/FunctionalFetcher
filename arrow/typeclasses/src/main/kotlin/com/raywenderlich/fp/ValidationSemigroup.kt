package com.raywenderlich.fp

class ValidationException(val messages: Array<String>)

operator fun ValidationException.plus(rh: ValidationException) =
  ValidationException(this.messages + messages)