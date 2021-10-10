
package org.epam.helloworld.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {
 
 @RequestMapping("/helloworld")
 public ModelAndView hello() {
 
  String helloWorldMessage = "This is Hello world from Epam!";
  return new ModelAndView("hello", "message", helloWorldMessage);
 }
}
