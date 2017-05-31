package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import main.database.modell.Artikel;
import main.database.modell.Bestellung;
import main.database.modell.Person;

@RestController
@RequestMapping("/artikel")
public class ArtikelController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping(value = "/anlegen", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void anlegen(@RequestBody Artikel artikel){
		//TODO artikel in db speichern
	}
	
	@PostMapping(value = "/aendern", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void ändern(@RequestBody Artikel artikel){
		//TODO artikel in db ändern
	}
	
	@PostMapping(value = "/ausgeben", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void ausgeben(@RequestBody long artikel_id){
		//TODO artikel aus db anhand id ausgeben
	}
	
	@PostMapping(value = "/löschen", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void anlegen(@RequestBody long artikel_id){
		//TODO artikel aus db anhand id löschen
	}
}
