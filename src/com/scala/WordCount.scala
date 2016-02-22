package com.scala

import scala.io.Source

object WordCount {
  def main(args: Array[String]) {
  //Replace with proper path
    val textContent = Source.fromFile("BASE_DIR/scala/src/com/scala/input.txt").mkString
    val countMap = textContent.split("\\s+").groupBy(x => x).mapValues(x => x.length)
    println(countMap)
  }
}
