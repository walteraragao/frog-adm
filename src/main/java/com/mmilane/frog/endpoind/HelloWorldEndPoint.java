package com.mmilane.frog.endpoind;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint/helloworld")
public class HelloWorldEndPoint {

	public HelloWorldEndPoint() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/teste")
	public List<String> teste(){
		List<String> teste = new ArrayList<>();
		teste.add("Hello");
		teste.add("World");
		
		return teste;
	}
}
