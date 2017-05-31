package main.database.modell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

	@JsonProperty("kundennummer")
	private String kundennummer;
	
	@JsonProperty("vorname")
	private String vorname;
	
	@JsonProperty("nachname")
	private String nachname;
	
	@JsonProperty("geburtsdatum")
	private String geburtsdatum;
	
	@JsonProperty("regdatum")
	private String regdatum;
	
	@JsonProperty("adresse")
	private Adresse adresse;
	
	@JsonProperty("umsatz")
	private double umsatz;
	
	/////////////////////////////////////////////////////////////////////////

	public String getKundennummer() {
		return kundennummer;
	}

	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String getRegdatum() {
		return regdatum;
	}

	public void setRegdatum(String regdatum) {
		this.regdatum = regdatum;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public double getUmsatz() {
		return umsatz;
	}

	public void setUmsatz(double umsatz) {
		this.umsatz = umsatz;
	}

}
