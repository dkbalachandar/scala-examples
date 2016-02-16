package com.scala

import java.io.IOException

object Main {
  def main(args: Array[String]) {

    println("Hi this is scala program")

    //Declare variables
    val var1: Int = 1
    val var2: Int = 2
    println("var1 ::" + var1)
    println("var2 ::" + var2)

    //Declare an array and iterate it
    print("Iterate an array")
    val intArray: Array[Int] = new Array[Int](5)
    for (i <- 0 until intArray.length) {
      println("i::" + i + " value:" + intArray(i))
    }
    for (i <- 0 until intArray.length) {
      intArray(i) = i
    }
    println("Other way to iterate an array")
    for (value <- intArray) {
      println(" value:" + value)
    }

    //if conditon
    if (var1 == 1) {
      println("Var1 is equals to 1")
    }

    //while loop
    var count: Int = 0
    while (count < 5) {
      println(" value:" + intArray(count))
      count = count + 1
    }

    //Filtering for Loops
    println("\n")
    //print statement executed only when the value is 4
    for (value <- intArray if value == 4) {
      println("value:" + value)
    }

    //Multiple filter conditions
    for (value <- intArray if value > 2 if value < 4) {
      println("value in between index 2 and 4 is " + value)
    }

    //Exception handling
    try {
      throw new IllegalStateException("An exception is thrown")
    } catch {
      case e: IllegalStateException => println("IllegalStateException got thrown")
      case e: IllegalArgumentException => println("IllegalArgumentException got thrown")
      case e: IOException => println("IO exception")
    } finally {
      println("finally block")
    }

    //Scala match expressions
    val stringVar = "stringValue"

    stringVar match {
      case "longValue" => println(stringVar + "_l")
      case "intValue" => println(stringVar + "_i")
      case "stringValue" => println(stringVar + "_s")
      case "doubleValue" => println(stringVar + "_d")
    }
    println("Match expression output.. stringVar: " + stringVar)

    //Assign match expression output to an another variable
    val matchResult =
      stringVar match {
        case "longValue" => stringVar + "_l"
        case "intValue" => stringVar + "_i"
        case "stringValue" => stringVar + "_s"
        case "doubleValue" => stringVar + "_d"
      }
    println("Match expression output.. matchResult: " + matchResult)

  }
}