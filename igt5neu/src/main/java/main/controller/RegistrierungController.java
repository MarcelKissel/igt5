package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import main.database.modell.Person;

@RestController
@RequestMapping("/registrierung/kunde")
public class RegistrierungController {
	
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping(value = "/pruefen", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void prüfen(@RequestBody long person_id){
		//TODO in der Datenbank nach dem Nutzer mit der ID suchen und die dementsprechende Message zurück geben
	}
	
	@PostMapping(value="/registrieren",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void registrieren(@RequestBody Person person){
		//TODO Person in DB einspeichern
		System.out.println("Person Vorname: "+ person.getVorname());
		System.out.println("Person Adresse: "+person.getAdresse().getStraße());
		System.out.println("Person Umsatz: "+person.getUmsatz());
	}	
}
