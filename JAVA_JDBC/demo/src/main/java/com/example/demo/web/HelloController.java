package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class HelloController {
  

  @RequestMapping(value = "/" , method=RequestMethod.GET)
  public String index(){
    return  "<h1> Hello M20922</h1>";
  }

  @RequestMapping(value = "/login", method =  RequestMethod.GET)
  public String login(){
    return "<h1>Login Page</h1>";
  }

}
