package com.business.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.business.TodoBusinessImpl;
import com.data.TodoService;


public class TodoBusinessImplMockTest {
	
	
	@Test
	public void usingMockito() {
		TodoService todoService = mock(TodoService.class);
		
		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
		
		when(todoService.retrieveTodos("Spring")).thenReturn(allTodos);
//		It should be used when we want to mock to return specific values 
//		when particular methods are called.
		
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(0, todos.size());
	}
	@Test
	public void usingMockito_withEmptyList() {
		TodoService todoService = mock(TodoService.class);
		
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(0, todos.size());
	}


}
