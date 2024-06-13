package com.example.springJsp.login;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class loginController1 {
	
	@RequestMapping("log")
	public ModelAndView Login(@RequestParam String name,ModelMap model) {
		model.put("name",name);
		return new ModelAndView("login");
	}

}
