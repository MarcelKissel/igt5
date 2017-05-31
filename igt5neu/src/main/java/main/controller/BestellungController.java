package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/bestellung")
public class BestellungController {
	
	private Logger LOGGER = LoggerFactory.getLogger(BestellungController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/erstellen")
	public void erstellen(){
		//Aufrufbar mit http://127.0.0.1:8080/bestellung/erstellen
		System.out.println("TEST");
		LOGGER.info("/bestellung/erstellen worked");
	}
	
	@PostMapping("/aendern")
	public void ändern(){
		
	}
	
	@PostMapping(value = "/ausgeben")
	public void ausgeben(){
		
	}
	
	@PostMapping(value = "/loeschen")
	public void löschen(){
		
	}

}
