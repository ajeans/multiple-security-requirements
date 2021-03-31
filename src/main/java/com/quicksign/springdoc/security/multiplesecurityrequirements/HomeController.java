package com.quicksign.springdoc.security.multiplesecurityrequirements;

import java.time.Instant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping(path = "/")
  public String hello() {
    return "Hello world at " + Instant.now().toString();
  }
}
