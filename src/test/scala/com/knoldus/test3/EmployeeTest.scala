package com.knoldus.test3

import org.scalatest.FunSuite

/**
  * Created by knoldus on 15/2/16.
  */
class EmployeeTest extends FunSuite {


  test("test for employee sorting:Random") {
    val output = List(Employee(21, "kunal", 210), Employee(23, "rishabh", 100), Employee(44, "deepti", 1100)).sorted
    val result = List(Employee(23, "rishabh", 100), Employee(21, "kunal", 210), Employee(44, "deepti", 1100))
    assert(result === output)

  }

}
