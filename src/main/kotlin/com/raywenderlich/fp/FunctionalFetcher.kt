package com.raywenderlich.fp

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import kotlin.streams.asSequence

class FetcherException(override val message: String) :
  IOException(message)

object FunctionalFetcher {
  fun fetch(url: URL): String {
    try {
      with(url.openConnection() as HttpURLConnection) {
        requestMethod = "GET"
        val reader = inputStream.bufferedReader()
        return reader.lines().asSequence().fold(StringBuilder()) { builder, line ->
          builder.append(line)
        }.toString()
      }
    } catch (ioe: IOException) {
      throw FetcherException(ioe.localizedMessage)
    }
  }
}

fun main() {
  val ok_url = URL("https://jsonplaceholder.typicode.com/todos")
  val error_url = URL("https://error_url.txt")
  val output = FunctionalFetcher.fetch(error_url)
  println(output)
}