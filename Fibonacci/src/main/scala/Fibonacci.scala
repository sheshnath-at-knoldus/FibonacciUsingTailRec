package com.knoldus

import scala.annotation.tailrec

class Fibonacci {

  @tailrec
  final def getFibonacciValue(number: Int, firstValue: Int = 0, secondValue: Int = 1): Int = {

    if (number < 0) throw new IllegalArgumentException("Negative value Found")
    if (number == 0) firstValue
    else if (number == 1) secondValue
    else
      getFibonacciValue(number - 1, secondValue, firstValue + secondValue)

  }

}


object FibonacciMain extends App {

  val fibonacciInstance = new Fibonacci

  val result = fibonacciInstance.getFibonacciValue(10)

  println(result)
}