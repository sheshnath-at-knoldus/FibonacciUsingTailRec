package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class FibonacciTest extends AnyFunSuite{

  test("Test case for Fibonacci Value check")
  {
    val fibonacciInstance = new Fibonacci

    val actualValue =fibonacciInstance.getFibonacciValue(10)
    val ExpectValue =55

    assert(actualValue===ExpectValue)
  }

  test("Test case for Zero Value check") {
    val fibonacciInstance = new Fibonacci

    val actualValue = fibonacciInstance.getFibonacciValue(0)
    val ExpectValue = 0

    assert(actualValue === ExpectValue)
  }

  test("Test case for One Value check") {
    val fibonacciInstance = new Fibonacci

    val actualValue = fibonacciInstance.getFibonacciValue(1)
    val ExpectValue = 1

    assert(actualValue === ExpectValue)
  }


}
