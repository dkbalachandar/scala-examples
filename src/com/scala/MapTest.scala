package com.scala

object MapTest {

  def main(args: Array[String]) {
    val fruits = List("apple","orange", "pineapple")
    //Print the contents
    println(fruits)
    //Convert into map
    println(fruits.map(_.toUpperCase()))
    //Convert into FlatMap
    println(fruits.flatMap(_.toUpperCase()))
  }
}
