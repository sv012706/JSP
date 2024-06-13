package com.example.springJsp.login;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SessionAttributes("Name")
public class LoginController {
	
	private authenticationService service=new authenticationService();


	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="sign",method=RequestMethod.GET)
	public ModelAndView Hellojsp() 
	{
		return new ModelAndView ("login");
		
	}
	//@RequestParam(value = "params", required = false) retrun "login"
	@RequestMapping(value="sign",method=RequestMethod.POST)
	//@ResponseBody
	public ModelAndView Welcomejsp( @RequestParam String Name,@RequestParam String Password,ModelMap model) 
	{
		if (service.Authenticate(Name,Password))
		{
			model.put("name", Name);
			model.put("password",Password);
			return new ModelAndView("welcome");
		}
		else
			model.put("Error Message","Invalid Credentionals, please check your username and password");
	return new ModelAndView("login");	
	}
	
}
