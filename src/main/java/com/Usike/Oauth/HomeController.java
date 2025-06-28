package com.Usike.Oauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

      @GetMapping("/greet")
    public String greet(){
            return "Welcome To My world";
      }
}
