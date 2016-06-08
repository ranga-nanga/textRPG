package heroes;

public class HeroClass {
	private String name;
	private int health = 7;
	private int strength = 3;
	private int magic = 3;
	private int dodge = 3;
	
	
	public HeroClass(String heroname){
		this.name = heroname;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getStrength(){
		return this.strength;
	}
	
	public int getMagic() {
		return this.magic;
	}
	
	public int getDodge() {
		return this.dodge;
	}
	
	public void printStats() {
		System.out.println(this.name + "'s stats:");
		System.out.println("Health: " + health);
		System.out.println("Strength: " + strength);
		System.out.println("Magic: " + magic);
		System.out.println("Dodge: " + dodge);
	}
		
}
