package com.raywenderlich.fp

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.json.JsonDecodingException
import kotlinx.serialization.list
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import kotlin.streams.asSequence

// 1
object FunctionalFetcherResult {
  fun fetch(url: URL): Result<FetcherException, String> {
    try {
      with(url.openConnection() as HttpURLConnection) {
        requestMethod = "GET"
        val reader = inputStream.bufferedReader()
        val result = reader.lines()
          .asSequence().fold(StringBuilder()) { builder, line ->
            builder.append(line)
          }.toString()
        // 2
        return Success(result)
      }
    } catch (ioe: IOException) {
      // 3
      return Error(FetcherException(ioe.localizedMessage))
    }
  }
}

@Serializable
data class Task(val userId: Int, val id: Int, val title: String, val completed: Boolean)

fun parseTasks(jsonData: String): Result<Exception, List<Task>> {
  val json = Json(JsonConfiguration.Stable)
  try {
    return Success(json.parse(Task.serializer().list, jsonData))
  } catch (ex: JsonDecodingException) {
    return Error(ex)
  }
}

fun dump(list: List<Task>): Success<List<Task>> {
  list.forEach {
    println(it)
  }
  return Success(list)
}

fun main() {
  val ok_url = URL("https://jsonplaceholder.typicode.com/todos")
  val error_url = URL("https://error_url.txt")
  FunctionalFetcherResult.fetch(ok_url).map {
    parseTasks(it)
  }.map {

  }
  val appParse = Result.just(::parseTasks)
  val appDump = Result.just(::dump)
  //val a = (FunctionalFetcherResult.fetch(ok_url).ap(::parseTasks))
}