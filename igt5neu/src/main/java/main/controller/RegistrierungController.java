package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/registrierung/kunde")
public class RegistrierungController {
	
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/pruefen")
	public void prüfen(){
	
	}
	
	@PostMapping("/registrieren")
	public void registrieren(){
	
	}	
}
