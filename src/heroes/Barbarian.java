package heroes;

import heroes.HeroClass;

public class Barbarian extends HeroClass {

	public Barbarian(int startHealth, int startStrength, int startMagic, int startDodge) {
		super(startHealth, startStrength, startMagic, startDodge);
		Barbarian Splurd = new Barbarian(15,7,3,5);
	}

}
