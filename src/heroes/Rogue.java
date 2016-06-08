package heroes;

import heroes.HeroClass;

public class Rogue extends HeroClass {
	private static int health = 11;
	private static int strength = 5;
	private static int magic = 3;
	private static int dodge = 11;
	
	public static int getHealth(){
		return health;
	}
	public static int getStrength(){
		return strength;
	}
	public static int getMagic() {
		return magic;
	}
	public static int getDodge(){
		return dodge;
	}
}
