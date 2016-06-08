package heroes;

public class HeroClass {
	public int health = 7;
	public int strength = 3;
	public int magic = 3;
	public int dodge = 3;
	
	public HeroClass(){

	}
	
	public int getHealth() {
		return health;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int getMagic() {
		return magic;
	}
	
	public int getDodge() {
		return dodge;
	}
	
	public void printStats() {
		System.out.println("Health: " + health);
		System.out.println("Strength: " + strength);
		System.out.println("Magic: " + magic);
		System.out.println("Dodge: " + dodge);
	}
		
}
