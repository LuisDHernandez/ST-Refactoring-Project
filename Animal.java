
public class Animal extends Character {
	
	private String name;
	private int power;
    private int smarts;
    private int speed;
    private int endurance;
    private Character owner;

	public Animal(Character player, String name) {
		this.name = name;
		power = 50;
		smarts = 50;
		speed = 50;
		endurance = 50;
		setOwner(player);
	}
	
	public void speak() {
		System.out.println("Howl");
	}
	
	public void setName(String userName) {
        name = userName;
    }

    public String getName() {
        return name;
    }

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getSmarts() {
		return smarts;
	}

	public void setSmarts(int smarts) {
		this.smarts = smarts;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	public Character getOwner() {
		return owner;
	}
	public void setOwner(Character owner) {
		this.owner = owner;
	}
}