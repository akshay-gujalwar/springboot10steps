package com.in28minutes.springboot.Springboot10Steps;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/books")
	public List<Book> getBooks()
	{
		ArrayList<Book> l = new ArrayList<Book>();
		l.add(new Book(1,"akshay","bauthor"));
		return l;
	}
}
