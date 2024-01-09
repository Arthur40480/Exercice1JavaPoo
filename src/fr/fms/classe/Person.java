package fr.fms.classe;

public class Person {
	// Attributs :
	public String lastName;		// Nom
	public String name;			// Prénom
	public int age;				// Age
	public String adress;		// Adresse
	
	// Constructeur :
	public Person(String lastName, String name, int age, String adress) {
		this.lastName = lastName;
		this.name = name;
		this.age = age;
		this.adress = adress;
		
	}
	
	public Person(String lastName, String name, int age) {
		this.lastName = lastName;
		this.name = name;
		this.age = age;
		this.adress = "unknow";
	}
	
	public Person(String lastName, String name) {
		this.lastName = lastName;
		this.name = name;
		this.age = 0;
		this.adress = "unknow";
	}
	
	// Méthode de classe :
	@Override
	// Méthode de classe permettant d'utiliser system.out.println() directement sur l'objet en question :
	public String toString() {
		return "[lastName= " + this.lastName + ", firstName= " + this.name + ", âge= " + this.age + ", adress= " + this.adress + "]";
	}
	
}
