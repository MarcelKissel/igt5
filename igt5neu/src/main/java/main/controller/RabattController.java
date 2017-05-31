package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rabatt")
public class RabattController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/pruefen")
	public void prüfen(){
		
	}
	
	@GetMapping("/test")
	public void test(){
		
	}

}
