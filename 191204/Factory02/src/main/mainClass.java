package main;

import person.Person;
import types.Atype;
import types.Btype;

public class mainClass {

	public static void main(String[] args) {
		
		Person human1 = new Person();		
		human1.create(new Btype());
		human1.m_Weapon.drawWeapon();
		human1.m_Bomb.drawBomb();
		
	}

}



