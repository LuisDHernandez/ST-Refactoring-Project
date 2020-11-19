
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
}
