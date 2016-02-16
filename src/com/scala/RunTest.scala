package com.scala


object RunTest {

  abstract class Animal {
    def runMessage: String
    def run() = println(runMessage)
  }

  class Dog extends Animal {
    val runMessage = "I'm an excellent runnner. I am a Dog"
  }

  class Cat extends Animal {
    val runMessage = "I'm a good runner. I am a Cat"
  }

  def main(args: Array[String]) {
    val animals = List(new Dog, new Cat)
    animals.foreach(animal => animal.run())
  }
}
