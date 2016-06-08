package heroes;

import heroes.HeroClass;

public class Wizard extends HeroClass {
	
	public Wizard(String heroname) {
		super(heroname);
	}
	
	private int health = 9;
	private int strength = 3;
	private int magic = 11;
	private int dodge = 7;
}