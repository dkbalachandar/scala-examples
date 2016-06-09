package com.scala

object ListTest {
  def main(args: Array[String]) {
    println(Lists.sum(List(1, 3, 2)))
    println(Lists.max(List(1, 3, 2)))
}

  object Lists {

    def sum(xs: List[Int]): Int = {
      if(xs == null) 0
      else if (xs.isEmpty)
        throw new NoSuchElementException("Its an empty list")
      else {
        var sum = 0
        xs.foreach(sum += _)
        sum
      }
    }

    def max(xs: List[Int]): Int = {
      if(xs == null) 0
      else if (xs.isEmpty)
        throw new NoSuchElementException("Its an empty list")
      else xs.iterator.max
    }
  }
}
