package com.lubinsu

import scala.collection.mutable.ArrayBuffer

/**
  * Created by lubinsu on 9/20/2016.
  *
  * 数组相关操作
  *
  */
object ArrayExample extends App {

  /**
    * 定长数组
    */
  val array1 = new Array[Int](10)
  val array2 = new Array[String](10)
  val array3 = new Array[Int](10)

  //类型推断
  val a = Array("array type")
  array1(0) = 10
  println(array1(0))
  println(a(0))

  a.toBuffer

  /**
    * 变长数组
    */

  val arrayBuffer = ArrayBuffer[String]()
  arrayBuffer += "a"
  arrayBuffer += "a"
  arrayBuffer += "a"

  println(arrayBuffer.mkString)

  arrayBuffer += ("b", "c")
  println(arrayBuffer.mkString)

  arrayBuffer.trimEnd(2)
  println(arrayBuffer.mkString)

  arrayBuffer.insert(2, "I")
  println(arrayBuffer.mkString)

  arrayBuffer.remove(2)
  println(arrayBuffer.mkString)

  //变长数组和不变长数组互转
  arrayBuffer.toArray

  val b = Array(2, 3, 5, 7, 11)
  val c = for (elem <- b if elem % 2 == 1) yield 2 * elem

  println(c.mkString)
}
