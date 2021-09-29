package com.example.demo

/**
 * Test Class for Experimenting with Collections Types in Scala
 */
class ScalaCollections {

  // Function to test Arrays, Vectors and Ranges
  def arrayVectorRange(): String = {
    val temps1: Array[Int] = Array(50, 60, 70, 80)
    println(temps1(1))
    println(temps1.length)
    temps1(0) = 24

    val temps2: Array[Int] = new Array[Int](10)

    //  val temps3 = Array.ofDim(10, 10)
    val temps3 = Array.ofDim[Int](10, 10)

    import Array._
    val out = concat(temps1, temps2)
    println("Concatenated Arrays")
    println(out.mkString(", "))

    //  Vectors are immutable
    val vec1: Vector[Int] = Vector(1, 2, 3, 4, 5)
    println("Showing Vector vec1")
    println(vec1(0))

    // Ranges are different

    val ra1: Range = 1 to 10
    val ra2: Range = Range(1, 101, 10)
    println(ra2)
    println("Printing Range: ra2")
    println(ra2.mkString(", "))
    ra2.mkString(", ")
  }

  def scalaMaps(): Unit = {
    val caps = Map(
      "India"-> "New Delhi",
      "Canada" -> "Ottawa",
      "U.S.A" -> "Washington DC"
    )

    println("\nKey List")
    println(caps.keys)
//    caps.values
    println(caps get "India")
    println(caps("Canada"))
    println(caps contains "U.S.A")
    println(caps getOrElse("China", "Not Found"))
    caps + ("Country" -> "Capital") // add
    caps - "Country" // remove
  }

}
