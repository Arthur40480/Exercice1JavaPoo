package fr.fms.test;

import java.util.*;
import fr.fms.classe.*;

public class TestPerson {

	public static void main(String[] args) {
//		Person manu = new Person("Macron", "Emmanuel", 43, "Elysee à Paris", new City("Amiens", "France"));
//		Person poutine = new Person("Poutine", "Vladimir", 68);
//		Person biden = new Person("Biden", "Joe");
//		
//		System.out.println(manu);
//		System.out.println(poutine);
//		System.out.println(biden);
		
		// On créer la Liste qui contiendra les personalités :
		ArrayList<Person> personalityList = new ArrayList<>();
		
		// On créer les personalités qui sont des instance de la class Person :
		Person manu = new Person("Macron", "Emmanuel", 43, "Elysee à Paris", new City("Amiens", "France"));
		Person nico = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));
		Person boris = new Person("Johnson", "Boris", 56, "Downing street at London", new City("New York", "Etats-unis"));
		Person gerard = new Person("Depardieu", "Gerard", 72, "Moscou", new City("Châteauroux", "France"));
		Person lenny = new Person("Kravitz", "Lenny", 56, "Hotel particulier à Paris", new City("New York", "USA"));
		Person jennifer = new Person("Lawrence", "Jennifer", 30, "Louisville aux USA", new City("Indian Hills", "USA"));
		
		// On ajoute les personalités dans la liste :
		personalityList.add(manu);
		personalityList.add(nico);
		personalityList.add(boris);
		personalityList.add(gerard);
		personalityList.add(lenny);
		personalityList.add(jennifer);
		
		// On apelle notre méthode :
		filterPersonalityList(personalityList);

	}
	// Méthode nous permettant de filtrer une liste de Person :
	public static void filterPersonalityList(ArrayList<Person> personalityList) {
		// On boucle sur chaque objet Person de notre ArrayList :
		for(Person person : personalityList) {
			// La méthode .indexOf retourne -1 si jamais le mot rechercher ne se trouve pas dans la string :
			int test = person.getAdress().indexOf("Paris");
			// Si Paris est trouver dans person.getAdress() OU que person.cityBorn.getCountry() vaut "France" alors :
			if(test != -1 || person.bornCity.getCountry().equals("France")) {
				// Si la population de la City est égale à 0 alors :
				if(person.bornCity.getNbrPeople() == 0) {
					System.out.println(person.getLastName() + " , " + person.getName() 
					+ " , " + person.getAge() + " , habitant " + person.getAdress() 
					+ " , Ville de naissance : " + person.bornCity.getCityName() + " , " +
					person.bornCity.getCountry());
				// Sinon :
				} else {
					System.out.println(person.getLastName() + " , " + person.getName() 
					+ " , " + person.getAge() + " , habitant " + person.getAdress() 
					+ " , Ville de naissance : " + person.bornCity.getCityName() + " , " +
					person.bornCity.getCountry() + " , population " + person.bornCity.getCityName()
					+ " " + person.bornCity.getNbrPeople() + " d'habitants");
				}
			}
		}	
	}
}
