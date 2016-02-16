package com.scala

object GenricsTest {

  class Print[T] {
    //Assign a default value based on the data type.
    private var contents: T = _

    def set(value: T) {
      contents = value
    }

    def get: T = contents
  }

  def main(args: Array[String]) {
    val string = new Print[String]
    string.set("Contents")
    println(string.get)

    val intValue = new Print[Int]
    intValue.set(1);
    println(intValue.get)

  }


}
