package fr.fms.test;

import fr.fms.classe.*;

public class TestCity {

	public static void main(String[] args) {
		
		// Instanciation de l'objet City :
		City toulouse = new City("Toulouse", "France", 470000);
		City bangkok = new City("Bangkok", "Taïlande", 10000000);
		City mostaganem = new City("Mostaganem", "Algérie", 300000);
		City londres = new City("Londres", "Angleterre", 9000000);
		
//		System.out.println("Ville:" + toulouse.cityName + " - Pays:" + toulouse.country + " - Nombre d'habitant:" + toulouse.nbrPeople);
//		System.out.println("Ville:" + bangkok.cityName + " - Pays:" + bangkok.country + " - Nombre d'habitant:" + bangkok.nbrPeople);
//		System.out.println("Ville:" + mostaganem.cityName + " - Pays:" + mostaganem.country + " - Nombre d'habitant:" + mostaganem.nbrPeople);
//		System.out.println("Ville:" + londres.cityName + " - Pays:" + londres.country + " - Nombre d'habitant:" + londres.nbrPeople);
//		
//		// On modifie la valeur nbrPeople de l'instance toulouse :
//		toulouse.nbrPeople = toulouse.nbrPeople - 20000;
		
//		// On modifie la valeur nbrPeople avec l'accesseur setNbrPeople :
//		toulouse.setNbrPeople(-200);
		
		// On modifie la valeur nbrPeople de l'instance toulouse avec la méthode subPeople() :
		toulouse.addPeople(-1);
		
 		System.out.println("Nombre d'habitant après modification : " + toulouse.getNbrPeople());
 		
// 		City rabat = new City("Rabat", 577000);
// 		System.out.println("[Ville : " + rabat.getCityName() + "] [Pays : " + rabat.getCountry() + "] + [Nombre d'habitants : " + rabat.getNbrPeople() + "]");
// 		rabat.setCountry("Maroc");
// 		System.out.println("[Ville : " + rabat.getCityName() + "] [Pays : " + rabat.getCountry() + "] + [Nombre d'habitants : " + rabat.getNbrPeople() + "]");

	}

}
