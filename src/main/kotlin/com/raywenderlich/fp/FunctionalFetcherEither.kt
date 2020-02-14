package com.raywenderlich.fp

import com.raywenderlich.fb.Either
import com.raywenderlich.fb.Left
import com.raywenderlich.fb.Right
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import kotlin.streams.asSequence

object FunctionalFetcherEither {
  // 2
  fun fetch(url: URL): Either<FetcherException, String> {
    try {
      with(url.openConnection() as HttpURLConnection) {
        requestMethod = "GET"
        val reader = inputStream.bufferedReader()
        val result = reader.lines()
          .asSequence().fold(StringBuilder()) { builder, line ->
            builder.append(line)
          }.toString()
        // 3
        return Right(result)
      }
    } catch (ioe: IOException) {
      // 4
      return Left(FetcherException(ioe.localizedMessage))
    }
  }
}

fun main() {
  val ok_url = URL("https://jsonplaceholder.typicode.com/todos")
  val error_url = URL("https://error_url.txt")
  println(FunctionalFetcherEither.fetch(error_url))
}
