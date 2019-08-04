package com.BookStoreClient.services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.BookStoreClient.beans.Book;

@Service
public class ClientService {

	public List<Book> showAllBooks() {
		String serviceUrl = "http://localhost:8081/book/allbooks";
		RestTemplate restTemplate = new RestTemplate();
		List<Book> allBooks = restTemplate.getForObject(serviceUrl, ArrayList.class);
		return allBooks;
	}

	
	public String orderBookById(int bookid) {
		String serviceUrl = "http://localhost:8081/book/order/{id}";
		HashMap<String, Integer> params = new HashMap<>();
		params.put("id",bookid);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(serviceUrl, null,params);
		return "Ordered Successfully";
	}


	public String addNewBook() {
		String serviceUrl = "http://localhost:8081/book/addbook";
		Book newBook = new Book("Inferno","Dan Brown",60,900);
		RestTemplate restTemplate = new RestTemplate();
		
		HttpEntity httpRequest = new HttpEntity(newBook);
		String message = restTemplate.postForObject(serviceUrl, httpRequest, String.class);
		return message;
	}

}
