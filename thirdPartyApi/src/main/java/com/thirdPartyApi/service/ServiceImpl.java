package com.thirdPartyApi.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.thirdPartyApi.model.User;

@Service
public class ServiceImpl {

	
	RestTemplate restTemplate;
	
	public User getData(User user) {
		String url ="https://reqres.in/api/users";
		restTemplate =new RestTemplate();
		ResponseEntity<User> responseEntity = restTemplate.postForEntity(url, user, User.class);
		
		
		System.out.println(responseEntity);
		
		
		return responseEntity.getBody();
	}
}
