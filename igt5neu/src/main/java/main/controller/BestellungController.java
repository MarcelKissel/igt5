package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import main.database.modell.Bestellung;
import main.database.modell.Person;

@RestController
@RequestMapping("/bestellung")
public class BestellungController {
	
	private Logger LOGGER = LoggerFactory.getLogger(BestellungController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping(value = "/erstellen", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void erstellen(@RequestBody Bestellung bestellung){
		//Aufrufbar mit http://127.0.0.1:8080/bestellung/erstellen
		//TODO Bestellung in DB einspeichern
		System.out.println(bestellung.getRabatt());
		LOGGER.info("/bestellung/erstellen worked");
	}
	
	@PostMapping(value = "/aendern", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void �ndern(@RequestBody Bestellung bestellung){
		//TODO Bestellung in DB ab�ndern
		
	}
	
	@PostMapping(value = "/rabatt/pruefen", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void pr�fen(@RequestBody Bestellung bestellung, Person person){
		//TODO Umsatz der person �berpr�fen und ggf. Rabatt auf die Bestellung gew�hren
	}
	
	@PostMapping(value = "/ausgeben", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void ausgeben(@RequestBody long bestellung_id){
		//TODO mit id nach Bestellung suchen und ausgeben -> void zu Bestellung �ndern

	}
	
	@PostMapping(value = "/loeschen", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void l�schen(@RequestBody long bestellung_id){
		//TODO Bestellung anhand von id in DB suchen und, falls erfolgreich zur�ckmelden.
		//Wenn nicht erfolgreich "Bestellung mit ID nicht vorhanden"
		
	}

}
