package br.inatel.myrestapi.springapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.myrestapi.springapi.model.MyMessage;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping
    public MyMessage processarGetHello() {
        MyMessage myMessage = new MyMessage();
        myMessage.setInfo("Hello World!");
        return myMessage;
    }
}
