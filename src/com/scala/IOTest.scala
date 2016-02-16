package com.scala

import scala.io.StdIn
import scala.io.Source

object IOTest {

  def main(args: Array[String]) {
    print("Please enter your input: " )
    val line = StdIn.readLine()
    println("You just typed: " + line)

    //Read from file
    readFileContents()
  }

  def readFileContents(): Unit ={

    //Replace with the proper path
    Source.fromFile("BASE_DIR/src/com/scala/input.txt" ).foreach{
      print
    }
  }

}
