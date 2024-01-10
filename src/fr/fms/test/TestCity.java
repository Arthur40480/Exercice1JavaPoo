package fr.fms.test;

import fr.fms.classe.*;

public class TestCity {

	public static void main(String[] args) {
		
		// Instanciation de l'objet City :
		City toulouse = new City("Toulouse", "France", 470000);
		City bangkok = new City("Bangkok", "Taïlande", 10000000);
		City mostaganem = new City("Mostaganem", "Algérie", 300000);
		City londres = new City("Londres", "Angleterre", 9000000);
		
		System.out.println("Ville:" + toulouse.getCityName() + " - Pays:" + toulouse.getCountry() + " - Nombre d'habitant:" + toulouse.getNbrInhabitant());
		System.out.println("Ville:" + bangkok.getCityName() + " - Pays:" + bangkok.getCountry() + " - Nombre d'habitant:" + bangkok.getNbrInhabitant());
		System.out.println("Ville:" + mostaganem.getCityName() + " - Pays:" + mostaganem.getCountry() + " - Nombre d'habitant:" + mostaganem.getNbrInhabitant());
		System.out.println("Ville:" + londres.getCityName() + " - Pays:" + londres.getCountry() + " - Nombre d'habitant:" + londres.getNbrInhabitant());
		
		// On modifie la valeur nbrPeople de l'instance toulouse :
//		toulouse.nbrInhabitant = toulouse.nbrInhabitant - 20000;
		
		// On modifie la valeur nbrPeople avec l'accesseur setNbrPeople :
		toulouse.setNbrInhabitant(-200);;
		
		// On modifie la valeur nbrPeople de l'instance toulouse avec la méthode subPeople() :
		toulouse.addPeople(-100000);
		
 		System.out.println("Nombre d'habitant après modification : " + toulouse.getNbrInhabitant());
 		
 		City rabat = new City("Rabat", 577000);
 		System.out.println("[Ville : " + rabat.getCityName() + "] [Pays : " + rabat.getCountry() + "] + [Nombre d'habitants : " + rabat.getNbrInhabitant() + "]");
 		rabat.setCountry("Maroc");
 		System.out.println("[Ville : " + rabat.getCityName() + "] [Pays : " + rabat.getCountry() + "] + [Nombre d'habitants : " + rabat.getNbrInhabitant() + "]");
		
		toulouse.displayCity();
		
		System.out.println(toulouse); // -> Cela affiche "fr.fms.classe.City@15db9742" c'est l'emplacement mémoire de notre instance toulouse.
		
		System.out.println(toulouse);
		System.out.println(City.nbrCity);
	}

}
