package fr.fms.test;

import fr.fms.classe.*;
public class TestPerson {

	public static void main(String[] args) {
		Person manu = new Person("Macron", "Emmanuel", 43, "Elysee à Paris");
		Person poutine = new Person("Poutine", "Vladimir", 43);
		Person biden = new Person("Biden", "Joe");
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);


	}

}
