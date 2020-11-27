package com.example.asynctest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.Callable;

@Slf4j
@Controller
public class RootController {

  @RequestMapping(value = "/main")
  @Anotacia
  public Callable<String> rootPage(){
    return () -> "main";
  }

  @RequestMapping(value = "/root")
  public String root(Model model){
    return "root";
  }

  @RequestMapping(value ="/")
  public Callable<ResponseEntity<String>> errorec(){
    return () ->
        new ResponseEntity<>( "ERR", HttpStatus.INTERNAL_SERVER_ERROR);
  }

}
