
package org.epam.helloworld.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	 Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
 
 @GetMapping("/hello")
 public String sayHello() {
     logger.info("In sayHello method...");
     logger.warn("Warning! There is some discrepancy in processing request.");
	 return "Hello world from Epam!";
 }
}
