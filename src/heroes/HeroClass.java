package heroes;

public class HeroClass {
	public int health = 7;
	public int strength = 3;
	public int magic = 3;
	public int dodge = 3;
	
	public HeroClass(){

		}
	
	public int getHealth(){
		return health;
	}
	public int getStrength(){
		return strength;
	}
	public int getMagic(){
		return magic;
	}
	public int getDodge(){
		return dodge;
	}
	
	public void getStats(){
		System.out.println("Health: " + this.health);
		System.out.println("Strength: " + this.strength);
		System.out.println("Magic: " + this.magic);
		System.out.println("Dodge: " + this.dodge);
	}
}
