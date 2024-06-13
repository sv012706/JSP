package com.example.springJsp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("ser")
	@ResponseBody
	public String sayHello()
	{
		return "Hello";
	}

}
