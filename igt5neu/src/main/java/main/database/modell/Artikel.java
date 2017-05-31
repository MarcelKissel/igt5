package main.database.modell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Artikel {
	
	@JsonProperty("artikelnummer")
	private long artikelnummer;
	
	@JsonProperty("bezeichnung")
	private String bezeichnung;
	
	@JsonProperty("preis")
	private double preis;
	
	@JsonProperty("kategorie")
	private String kategorie;

	/////////////////////////////////////////////////////////////////////////
	
	public long getArtikelnummer() {
		return artikelnummer;
	}

	public void setArtikelnummer(long artikelnummer) {
		this.artikelnummer = artikelnummer;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getKategorie() {
		return kategorie;
	}

	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}
}
