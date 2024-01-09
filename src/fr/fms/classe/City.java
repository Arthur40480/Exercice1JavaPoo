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
	public void subPeople(int peopleToSub) {
		if(peopleToSub > this.nbrPeople) {
			System.out.println("Le nombre d'habitant ne peut être négatif");
			return;
		}
		this.nbrPeople = this.nbrPeople - peopleToSub;
	}
}
