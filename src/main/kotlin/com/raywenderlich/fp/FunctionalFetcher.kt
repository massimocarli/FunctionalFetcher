package com.raywenderlich.fp

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import kotlin.streams.asSequence

class FetcherException(override val message: String) :
  IOException(message)

//object FunctionalFetcher {
//  fun fetch(url: URL): String {
//    try {
//      with(url.openConnection() as HttpURLConnection) {
//        requestMethod = "GET"
//        val reader = inputStream.bufferedReader()
//        return reader.lines().asSequence().fold(StringBuilder()) { builder, line ->
//          builder.append(line)
//        }.toString()
//      }
//    } catch (ioe: IOException) {
//      throw FetcherException(ioe.localizedMessage)
//    }
//  }
//}

//object FunctionalFetcher {
//  fun fetch(url: URL): Pair<FetcherException?, String?> {
//    try {
//      with(url.openConnection() as HttpURLConnection) {
//        requestMethod = "GET"
//        val reader = inputStream.bufferedReader()
//        return null to reader.lines().asSequence().fold(StringBuilder()) { builder, line ->
//          builder.append(line)
//        }.toString()
//      }
//    } catch (ioe: IOException) {
//      return FetcherException(ioe.localizedMessage) to null
//    }
//  }
//}

object FunctionalFetcher {
  fun fetch(url: URL): Result<FetcherException, String> {
    try {
      with(url.openConnection() as HttpURLConnection) {
        requestMethod = "GET"
        val reader = inputStream.bufferedReader()
        val json = reader.lines().asSequence().fold(StringBuilder()) { builder, line ->
          builder.append(line)
        }.toString()
        return Success(json)
      }
    } catch (ioe: IOException) {
      return Error(FetcherException(ioe.localizedMessage))
    }
  }
}

fun main() {
  val ok_url = URL("https://jsonplaceholder.typicode.com/todos")
  val error_url = URL("https://error_url.txt")
  // 1
  val printErrorFun = { ex: FetcherException -> println("Error with message ${ex.message}") }
  // 2
  val printString = { str: String -> print(str) }
  // 3
  FunctionalFetcher.fetch(error_url)
    .bimap(printErrorFun, printString)
}
