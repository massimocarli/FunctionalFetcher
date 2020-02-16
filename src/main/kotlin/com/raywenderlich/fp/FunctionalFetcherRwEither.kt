package com.raywenderlich.fp

import com.raywenderlich.fp.rweither.bifunctor.bimap
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import kotlin.streams.asSequence

object FunctionalFetcherRwEither {
  // 2
  fun fetch(url: URL): RwEither<FetcherException, String> {
    try {
      with(url.openConnection() as HttpURLConnection) {
        requestMethod = "GET"
        val reader = inputStream.bufferedReader()
        val result = reader.lines()
          .asSequence().fold(StringBuilder()) { builder, line ->
            builder.append(line)
          }.toString()
        // 3
        return RwRight(result)
      }
    } catch (ioe: IOException) {
      // 4
      return RwLeft(FetcherException(ioe.localizedMessage))
    }
  }
}

/*
fun main() {
  val ok_url = URL("https://jsonplaceholder.typicode.com/todos")
  val error_url = URL("https://error_url.txt")
  println(FunctionalFetcherRwEither.fetch(error_url))
}
 */
fun main() {
  val ok_url = URL("https://jsonplaceholder.typicode.com/todos")
  val error_url = URL("https://error_url.txt")
  // 1
  val printErrorFun = { ex: FetcherException -> println("Error with message ${ex.message}") }
  // 2
  val printString = { str: String -> print(str) }
  // 3
  FunctionalFetcherRwEither.fetch(error_url)
    .bimap(printErrorFun, printString)
}

