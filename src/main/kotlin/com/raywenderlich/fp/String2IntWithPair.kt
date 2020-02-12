package com.raywenderlich.fp

fun intConverterWithPair(str: String): Pair<NumberFormatException?, Int?> {
  try {
    val intValue = str.toInt()
    return null to intValue
  } catch (nfe: NumberFormatException) {
    return nfe to null
  }
}

fun main() {
  // 1
  val inputString = "21"
  // 2
  val resultPair = intConverterWithPair(inputString)
  // 3
  resultPair.first?.let {
    println("Something wrong: ${it.localizedMessage}")
  }
  // 4
  resultPair.second?.let {
    println("The String \"$inputString\" contains the Int: $it")
  }
}
