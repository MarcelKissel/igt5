package main.database.modell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Adresse {
	

	@JsonProperty("wohnort")
	private String wohnort;
	
	@JsonProperty("plz")
	private String plz;
	
	@JsonProperty("stra�e")
	private String stra�e;
	
	@JsonProperty("hausnummer")
	private int hausnummer;

	/////////////////////////////////////////////////////////////////////////
	
	public String getWohnort() {
		return wohnort;
	}

	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getStra�e() {
		return stra�e;
	}

	public void setStra�e(String stra�e) {
		this.stra�e = stra�e;
	}

	public int getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}


}
