package com.example.springJsp.login.Todo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@RestController
@SessionAttributes("Name")

public class TodoController {
	private TodoService todoService;
	
	

	@Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }



	@RequestMapping("todos")

	public ModelAndView ListAllTodos(ModelMap map) {
		List<Todo>Todos=todoService.findUserByName("srikanth");
		map.addAttribute("todos",Todos);
		
		
		return new ModelAndView("ListTodos");
	}
}
