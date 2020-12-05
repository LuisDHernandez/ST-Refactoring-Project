import java.util.ArrayList;
import java.util.Random;

public class Character {

    private String name;
    private int Rep;
    private int power;
    private int smarts;
    private int speed;
    private int endurance;
    ArrayList<String> inventory = new ArrayList<String>();

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
	
	public ArrayList<String> getInventory(){
		return inventory;
	}
	
	public void setInventory(String item) {
		inventory.add(item);
	}
	
	public void explain_game_skills() {
		
		System.out.println("Luis: All characters have different skills that are randomly "
                + "generated :" + " Power, Speed, Smarts, and Endurance.");
		// set the player skills
        Random randomSkill = new Random();
        power = (randomSkill.nextInt(10) + 1);
        speed = (randomSkill.nextInt(10) + 1);
        smarts = (randomSkill.nextInt(10) + 1);
        endurance = (randomSkill.nextInt(10) + 1);
        
        System.out.println("Your skill levels are: \n Strength: " + power + " \n Agility: "
                + speed + "\n Intelligence: " + smarts + "\n Stamina: " + endurance);
	}
}