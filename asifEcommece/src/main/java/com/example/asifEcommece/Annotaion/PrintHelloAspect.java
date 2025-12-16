package com.example.asifEcommece.Annotaion;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintHelloAspect {

    @Before("@annotaion(PrintHello)")
    public void PrintHello(PrintHello printHello){
        System.out.println("Hello World");
    }
}

