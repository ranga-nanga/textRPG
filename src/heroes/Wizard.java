package heroes;

import heroes.HeroClass;

public class Wizard extends HeroClass {
	private static int health = 9;
	private static int strength = 3;
	private static int magic = 11;
	private static int dodge = 7;
	
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