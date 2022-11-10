package com.business.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.business.TodoBusinessImpl;
import com.data.TodoService;
import com.data.test.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void usingAStub1() {
		TodoService todoService = new TodoServiceStub();
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Dummy1");
		
		assertEquals(2, todos.size());
	}
	@Test
	public void usingAStub2() {
		TodoService todoService = new TodoServiceStub();
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Dummy2");
		
		assertEquals(0, todos.size());
	}

}
