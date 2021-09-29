package com.example.demo

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class ScalaController {

  @GetMapping(path=Array("/demo"))
  def demo: String = {
    "This is SpringBoot Application from Scala."
  }
}


object Hello extends App{
  println("Hello, World!")

  val obj = new ScalaCollections(0, 0, 100)
  obj.arrayVectorRange()
  obj.scalaMaps()

  println(obj.getZ)

  // Parallel Processing Constructs
  val obj2 = new ParallelCollections
  obj2.mappingParallels()
  obj2.filteringCollections()
}