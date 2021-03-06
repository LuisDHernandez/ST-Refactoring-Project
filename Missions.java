import java.util.InputMismatchException;

public class Missions {

	public static void do_mission_one(Character player, int answer) {
		if (answer == 4) {
            player.setRep(player.getRep() + 1);
            System.out.println(
                    "Nice! You helped the civilian! Your Rep grows everytime" + " you succeed!");
            System.out.println("Rep: " + player.getRep());
        } else {
        	player.setRep(player.getRep() - 1);
            System.out.println("You have failed but there's always next time!\n Rep:" + player.getRep());
        }
		player.setPower((int)Math.pow(player.getPower() + 1, 2));
        System.out.println("If an activity is very physically challenging or mentally "
                + "straining and you succeed," + " your skills might also increase exponentially!"
                + "\nThis time, helping the civilian increased your" + " Strength!" + "\nStrength: "
                + player.getPower());
	}

	public static void do_mission_two(Character player, int catchBadGuy) {
		int even = catchBadGuy % 2;
        if (catchBadGuy > 10) {
            if (catchBadGuy < 50) {
                if (even == 0) {
                	player.setSpeed((int)Math.pow(player.getSpeed() + 1, 2));
                    player.setRep(player.getRep() + 3);
                    System.out
                            .println("Good job! You caught the criminal and became" + " a stronger "
                                    + "hero! \n Agility : " + player.getSpeed() + "\n Rep: " + player.getRep());

                } else {
                    player.setRep(player.getRep() - 1);
                    System.out.println("You almost had him, but he just slipped "
                            + "away! He won't get away next time!\n " + "Rep: " + player.getRep());
                }

            } else {
                player.setRep(player.getRep() - 3);
                System.out.println("You ran so fast that you went passed him and"
                        + " slammed into a" + " wall! Maybe you have super agility"
                        + " and need to learn how to control" + " it!\n Rep: " + player.getRep());

            }
        } else {
            System.out.println("He got away! Maybe your Agility is too low. Do not be "
                    + "dismayed, there are plenty of " + "oppertunities waiting!\n Rep: "
                    + player.getRep());
        }
		
	}
	
	public static void do_mission_three(Character player, int train) {
		int count_months = train;
		while(count_months >= 0) {
			player.setPower(player.getPower() + 1);
			player.setSpeed(player.getSpeed() + 1);
			player.setSmarts(player.getSmarts() + 1);
			player.setEndurance(player.getEndurance() + 1);
			count_months--;
		}
		System.out.println("Congrats! After training for " + train + " months, you abilities have increased:\nPower: " + player.getPower() + 
				"\nSpeed: " + player.getSpeed() + "\nSmarts: " + player.getSmarts() + "\nEndurance: " + player.getEndurance());
	}
	
	public static void do_mission_four(Character player, int plug, int chug) {
		 int first_n = plug;
		 if(first_n < 10) {
			 int second_n = chug;
		     int keepgoing = 0;
		     int win = 0;
		     do {
		    	 win = (first_n * 2 + (second_n + first_n)) + 1;
		         keepgoing++;
		        } while (keepgoing < 2);
		     player.setSmarts(player.getSmarts() + win);
		     player.setRep(player.getRep() + 1);
		     System.out.println("Congrats you won your chess match! Your Smarts increased to: " + player.getSmarts());
		 }
		 else {
			System.out.println("You didn't make the right play and lost your chess match!");
			player.setSmarts(player.getSmarts() - 4);
			player.setRep(player.getRep() - 1);
			System.out.println("Your Smarts is now at: " + player.getSmarts());
		 }
	}

	public static void do_mission_five(Character player, int inputA, int inputB) {

        boolean check = false;
        while (check == false) {
            try {
                int distance = (inputA * 5) / inputB;
                player.setRep(player.getRep() + 1);
                player.setEndurance(player.getEndurance() * distance);
                System.out.println("Good job hero you made it across the long road and got stronger!" );
                check = true;
            } catch (InputMismatchException notAnInt) {
            	player.setRep(player.getRep() - 1);
                System.out.println("Since you didn't input an integer, you fell along the way and hurt your leg!");
            } catch (ArithmeticException dividedByZero) {
            	player.setRep(player.getRep() - 3);
                System.out.println("Your second number was zero, creating an issue in the matrix and causing you to completely miss the road fall into the ravine!");
            }
        }	
	}

	public static void do_mission_six(Character player, Animal pet, String pet_name) {
		System.out.println("You successfully tamed the animal, and named them " + pet.getName() + ".\nYour pet lets out its signature sound: ");
		pet.speak();
		System.out.println("You give the animal a nametag with your name, " + pet.getOwner().getName() + ", and "
				+ "leave a phone number to reach you at in case they get lost.");
	}
	
	public static void do_mission_seven(Character player, int num) {
		
		player.setInventory("deodorant");
		player.setInventory("flashlight");
		player.setInventory("tape");
		
		if(num % 2 == 0) {
		System.out.println("After checking the bag it seems you only have the following items: " + player.getInventory().toString());
		System.out.println("You ponder where your lucky 8-ball might have went.");
		player.setRep(player.getRep() - 1);
		}
		else {
			player.setInventory("Lucky 8-ball");
			System.out.println("You check to see all the items in your inventory: " + player.getInventory().toString());
			player.setRep(player.getRep() + 1);
		}	
	}
}
