package heroes;

import heroes.HeroClass;

public class Barbarian extends HeroClass {
	private int health = 15;
	private int strength = 7;
	private int magic = 3;
	private int dodge = 5;

	public int getHealth(){
		return health;
	}
	public  int getStrength(){
		return strength;
	}
	public int getMagic() {
		return magic;
	}
	public int getDodge(){
		return dodge;
	}
	
}

