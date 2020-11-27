package com.example.asynctest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GlobalAspect {



  @Before("@annotation(Anotacia)")
  public void spracuj(){

    System.out.println("SPRACOVANE");

  }



}
