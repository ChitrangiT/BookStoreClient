package com.BookStoreClient.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.BookStoreClient.beans.Book;
import com.BookStoreClient.services.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	@RequestMapping(value="/showallbooks" , method=RequestMethod.GET)
	public ResponseEntity<String> showAllBooks(){
		
		List<Book> allBooks = clientService.showAllBooks();
		return new ResponseEntity<String>("Books: "+allBooks, HttpStatus.OK);
	
	}
	
	@RequestMapping(value="/orderbook/{id}" , method=RequestMethod.GET)
	public ResponseEntity<String> orderBookById(@PathVariable ("id") int id){
		
		String message = clientService.orderBookById(id);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	@RequestMapping(value="/addbook" , method=RequestMethod.GET)
	public ResponseEntity<String> addNewBook(){
		
		String message = clientService.addNewBook();
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	

}
