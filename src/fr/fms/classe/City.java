package fr.fms.classe;

public class City { // Classe City :
	// Attributs :
	public String cityName;			// Nom de la ville
	public String country;			// Pays
	public double nbrPeople;		// Nombre d'habitants
	
	// Constructeurs :
	public City(String cityName, String country, double nbrPeople) {
		this.cityName = cityName;
		this.country = country;
		this.nbrPeople = nbrPeople;
	}
}
