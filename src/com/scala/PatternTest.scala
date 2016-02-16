package com.scala

import scala.util.matching.Regex

object PatternTest {

  def main(args: Array[String]) {

    val pattern = new Regex("(s|S)cala")
    val str = "scala is good and an object/functional programming language. Scala has lots of cool features"
    //Find all matching characters and then join by ,
    println((pattern findAllIn str).mkString(","))
    //Find first matched
    println(pattern findFirstIn str)
    //Replace first matched
    println(pattern replaceFirstIn(str, "Java"))
    //Replace all matched
    println(pattern replaceAllIn (str, "Java"))
  }

}
