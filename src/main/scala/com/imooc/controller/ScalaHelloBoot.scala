package com.imooc.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
object ScalaHelloBoot {
  @RequestMapping(value = Array("/sayScalaHello"),method = Array(RequestMethod.GET))
  def sayHello(): String = {
    "hello scala boot"
  }
}
