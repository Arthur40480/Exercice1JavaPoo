package fr.fms.classe;

public class City { // Classe City :
	// Attributs :
	public String cityName;			// Nom de la ville
	public String country;			// Pays
	private int nbrPeople;		// Nombre d'habitants
	
	// Constructeurs :
	public City(String cityName, String country, int nbrPeople) {
		this.cityName = cityName;
		this.country = country;
		setNbrPeople(nbrPeople);
	}
	
	public City(String cityName, int nbrPeople) {
		this.cityName = cityName;
		this.country = "unknow";
		setNbrPeople(nbrPeople);
	}
	
	// Accesseur (getter et setter) :
	public String getCityName() {
		return cityName;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getNbrPeople() {
		return nbrPeople;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setNbrPeople(int nbrPeople) {
		// Si nbrPeople inferieur à 0, alors on return :
		if(nbrPeople < 0) {
			System.out.println("Le nombre d'habitant ne peut être négatif");
			return;
		}
		this.nbrPeople = nbrPeople;
	}
	
	// Méthode de classe :
	public void addPeople(int peopleToAdd) {
		if(this.nbrPeople > (this.nbrPeople + peopleToAdd)) {
			System.out.println("Impossible de réduire la population !");
			return;
		}
		this.nbrPeople = this.nbrPeople + peopleToAdd;
	}
	
	public void displayCity() {
		System.out.println("Ville de " + this.cityName + " en " + this.country);
	}
}
