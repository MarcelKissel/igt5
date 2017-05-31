package main.database.modell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bestellung {
	
	@JsonProperty("bestellungsnummer")
	private String bestellungsnummer;
	
	@JsonProperty("datum")
	private String datum;
	
	@JsonProperty("rabatt")
	private double rabatt;
	
	@JsonProperty("artikel")
	private Artikel[] artikel;
	
	/////////////////////////////////////////////////////////////////////////
	
	public String getBestellungsnummer() {
		return bestellungsnummer;
	}

	public void setBestellungsnummer(String bestellungsnummer) {
		this.bestellungsnummer = bestellungsnummer;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public double getRabatt() {
		return rabatt;
	}

	public void setRabatt(double rabatt) {
		this.rabatt = rabatt;
	}

	public Artikel[] getArtikel() {
		return artikel;
	}

	public void setArtikel(Artikel[] artikel) {
		this.artikel = artikel;
	}
	
}
