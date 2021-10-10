
package org.epam.helloworld.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
 
 @GetMapping("/hello")
 public String sayHello() {
 
  return "Hello world from Epam!";
 }
}
