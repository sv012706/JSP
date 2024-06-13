package com.example.springJsp.login.Todo;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos=new ArrayList<>();
	static {
		todos.add(new Todo(1,"srikanth","vijayawada",876599969,"phonepe"));
		todos.add(new Todo(1,"sriram","vijayawada",876587969,"phonepe"));
		todos.add(new Todo(1,"srikar","vijayawada",876555969,"phonepe"));
		todos.add(new Todo(1,"sridhar","vijayawada",876578969,"phonepe"));
	}
	public List<Todo> findUserByName(String username){
		return todos;
	}

}
