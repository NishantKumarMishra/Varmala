package com.Varmala.Varmala;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/check")
@RestController
public class Healthcheck {


   @GetMapping
   public String check()
   {
       return "ok";
   }
}
