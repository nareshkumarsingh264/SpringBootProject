package com.naresh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.model.Book;
import com.naresh.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	BookRepository bookRepository;

	@PostMapping("/bookSave")
	public String insertBook(@RequestBody Book book) {
		bookRepository.save(book);
		return "your record is saved successfully !!";
	}

	@PostMapping("/multiplebookSave")
	public String insertBook(@RequestBody List<Book> book) {
		bookRepository.saveAll(book);
		return " record is saved successfully !!";
	}

@GetMapping("/getAllBook")
public List<Book> getBook() {
	
	return (List<Book>)bookRepository.findAll();
}

@GetMapping("/getByBookName/{name}")
public List<Book> getBook(@PathVariable("name") String bookName) {
	
	return (List<Book>)bookRepository.findBybookName(bookName);
}

@GetMapping("/getByBookId/{bookId}")
public Optional<Book> getBook(@PathVariable("bookId") Long id) {
	
	return bookRepository.findById(id);
}


@PutMapping("/updateBook")
public String updateBook(@RequestBody Book book) {
	bookRepository.save(book);
	return "your record is update successfully !!";
}
@DeleteMapping("/deleteBook/{id}")
public String deleteBook(@PathVariable Long id) {
	bookRepository.deleteById(id);
	return "your record is delete successfully !!";
}
}
