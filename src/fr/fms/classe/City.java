package fr.fms.classe;
import java.util.*;


public class City { // Classe City :
	// Attributs :
	public String cityName;			// Nom de la ville
	public String country;			// Pays
	public int nbrPeople;		// Nombre d'habitants
	
	// Constructeurs :
	public City(String cityName, String country, int nbrPeople) {
		this.cityName = cityName;
		this.country = country;
		this.nbrPeople = nbrPeople;
	}
	
	// Accesseur (getter et setter) :
	public String getCityName(String cityName) {
		return cityName;
	}
	
	public String getCountry(String country) {
		return country;
	}
	
	public int getNbrPeople(int nbrPeople) {
		return nbrPeople;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setNbrPeople(int nbrPeople) {
		if(nbrPeople < 0) 
			throw new RunTimeException("Le nombre d'habitant ne peut être négatif !");
		this.nbrPeople = nbrPeople;
	}
}
