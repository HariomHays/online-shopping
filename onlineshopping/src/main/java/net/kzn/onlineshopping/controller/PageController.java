package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("Page");
		mv.addObject("greetings","hello man why");
		return mv;
	}
	/*@RequestMapping(value = {"/test"})
	public ModelAndView test(@RequestParam(value="greetings", required=false)String greetings)
	{		if(greetings==null)
		{			greetings="hello there";
		}
		ModelAndView mv=new ModelAndView("Page");
		mv.addObject("greetings",greetings);
		return mv;
	}*/

}
