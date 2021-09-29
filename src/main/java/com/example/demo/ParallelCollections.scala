package com.example.demo

import scala.collection.parallel.CollectionConverters._
import scala.collection.parallel.immutable.{ParRange, ParVector}

class ParallelCollections {

  def createParCollection(): Unit = {
    val r1: Range.Inclusive = 1 to 100
    var par1: ParRange = r1.par

    var par2: ParVector[Int] = ParVector.range(0, 200)
  }

  def square(x: Int): Int = {
    x * x
  }

  def mappingParallels(): Unit = {
    val v = (1 to 100).toArray

    val pv = v.par

    // multiply each member
    v.map(_ * 2)
    pv.map(_ * 2)

    val ret = v.map(square)
    //    val ret = v.map(square(_))
    println(ret.mkString(", "))
  }


  def div3(x: Int): Boolean = {
    val y : Int = x % 3
    0 == y
  }

  def filteringCollections(): Unit = {
    val v = (1 to 10000).toArray
    val pv = v.par

    val selected = pv.filter(_ > 5000)
    val notSelected = pv.filterNot(_ > 5000)

    println(selected, "\n\n", notSelected)
    //    val filtered = pv.filter(div3(_))
    val filtered = pv.filter(div3)
    println("Filtered ", filtered)
  }
}
