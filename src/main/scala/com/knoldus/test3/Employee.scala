package com.knoldus.test3

/**
  * Created by knoldus on 15/2/16.
  */
case class Employee( id:Long,  name:String, salary:Long) {
}

object Employee{

  implicit val check= new Ordering[Employee]{

    def compare(x:Employee,y:Employee)= implicitly[Ordering[Long]].compare(x.salary,y.salary)

  }
}