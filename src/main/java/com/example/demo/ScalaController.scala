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

  val obj = new ScalaCollections
  obj.arrayVectorRange()
  obj.scalaMaps()
}