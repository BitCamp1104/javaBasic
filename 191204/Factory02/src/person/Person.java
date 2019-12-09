package person;

import bomb.Bomb;
import types.AbstractItem;
import weapon.Weapon;

public class Person {
	
	public Weapon m_Weapon;
	public Bomb m_Bomb;
	
	public void create(AbstractItem aw) {
		m_Weapon = aw.createWeapon();
		m_Bomb = aw.createBomb();
	}

}






