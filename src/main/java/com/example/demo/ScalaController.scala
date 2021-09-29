package com.example.demo

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class ScalaController {

  @GetMapping(path=Array("/demo"))
  def demo = {
    "This is SpringBoot Application from Scala."
  }
}


object Hello extends App{
  println("Hello, World!")
}