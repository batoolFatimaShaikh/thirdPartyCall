package com.thirdPartyApi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.thirdPartyApi.model.User;
import com.thirdPartyApi.service.ServiceImpl;


@RestController
public class Controller {
	
	@Autowired
	private ServiceImpl serviceImpl;

	@GetMapping("/api")
	public String hello() {
		return "hello";
	}
	@GetMapping(value ="/acc")
	private String getHelloAccess() {
		String uri="http://localhost:8080/api";
		RestTemplate restTemplate = new RestTemplate();
		String result=restTemplate.getForObject(uri,String.class);
		return result;
	} 
	@PostMapping("/id")
	private User getUser(@RequestBody User user)
	{
		return serviceImpl.getData(user);
	}
	
//	public 
//	RestTemplate restTemplate = new RestTemplate(); //1
//	String url = "http://www.algumacoisa.com.br/api"; //2
//	ResponseEntity<String> response= restTemplate.getForEntity(url, String.class);
}
