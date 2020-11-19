public class Character {

    private String name;
    private int Rep;
    private int power;
    private int smarts;
    private int speed;
    private int endurance;

    public Character() {
        // System.out.println("This is the default constructor!");
        name = "test";
    }

    public Character(String userName) {
        // System.out.println("This is the overloaded constructor!");
        userName = name;
    }

    public void setName(String userName) {
        name = userName;
    }

    public String getName() {
        return name;
    }

	public int getRep() {
		return Rep;
	}

	public void setRep(int rep) {
		Rep = rep;
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
	
	public void explain_game_skills() {
		
		System.out.println("Luis: All characters have different skills that are randomly "
                + "generated :" + " Power, Speed, Smarts, and Endurance.");
	}
}