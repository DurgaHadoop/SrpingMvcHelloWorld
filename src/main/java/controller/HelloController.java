package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController 
{
	  @RequestMapping("/")
      public ModelAndView message()
      {
    	  ModelAndView m=new ModelAndView("hello");
    	  m.addObject("msg","Hello World!");
    	  return m;
    	  
      }
}
