
package com.knoldus.test3

import scala.concurrent.{Promise, Await, Future, duration}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success

/**
  * Created by knoldus on 15/2/16.
  */
object FutureCompletion {

  def input(list: List[Int]): List[Future[Int]] = {
    require(list != List())

    def findSquare(num: Int): Int = {

      num * num

    }

    val result = list.map { a => Future {
      findSquare(a)
    }
    }
    result

  }

  def findFirstFuture(list: List[Future[Int]]):Future[Int] ={

  val promise = Promise[Int]
    val future = promise.future
    list.foreach{
      _ onSuccess {
        case a => {
          try {
            promise success a
          }catch {
            case e:java.lang.IllegalThreadStateException =>
          }
        }
    }

  }
}
