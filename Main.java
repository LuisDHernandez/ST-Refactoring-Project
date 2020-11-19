import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// Luis Hernandez COP 2006
// A first year program to show a mini-game that inspires me to code and learn 
// more.

public class Main {

    /**
     * the driver class that runs my minigame.
     * <p>
     * This program runs as an input based game that progresses as the user inputs
     * answers. Overall, this is a basic program to show my growth in programming.
     * 
     * @param args
     */

    public static void main(String[] args) {
        // sysout ctrl spacebar = system.out.println();
       
        Introduction.printIntro();

        Scanner scan = new Scanner(System.in);
        
        Character Player = new Character();
        Player.setRep(0);
        
        String userName = scan.nextLine();
        userName = userName.substring(0, 1).toUpperCase() + userName.substring(1);
        Player.setName(userName);
        System.out.println("Luis: Hello " + Player.getName() + ", it's so nice to meet you!");

        System.out.println("What month is it? [Give your answer between 1 and 12.]");
        int month = scan.nextInt();
        String theMonth = Month_and_Year.setMonth(month);
        System.out.println("So it's " + theMonth + " but what year is it?");
        int year = scan.nextInt();
        System.out.println(
                "It's " + theMonth + " " + year + ", and now it's time to get this game started!");

        Player.explain_game_skills();
        // set the player skills
        Random randomSkill = new Random();
        Player.setPower(randomSkill.nextInt(10) + 1);
        Player.setSpeed(randomSkill.nextInt(10) + 1);
        Player.setSmarts(randomSkill.nextInt(10) + 1);
        Player.setEndurance(randomSkill.nextInt(10) + 1);
        
        System.out.println("Your skill levels are: \n Strength: " + Player.getPower() + " \n Agility: "
                + Player.getSpeed() + "\n Intelligence: " + Player.getSmarts() + "\n Stamina: " + Player.getEndurance());

        System.out.println("Every game starts with a first mission. For this mission,"
                + " input a number bigger than 10 to continue!");
        double usernumInput = scan.nextDouble();
        // first "mission" - controller input heavy program
        if (usernumInput > 10) {
            System.out.println("Good job! There are more tasks ahead that you have " + "to pass!");
        } else {
            System.out.println("You've failed the first mission!\nBut don't worry you'll"
                    + " have another chance.");
        }
        System.out.println("Lets get ready to start you on your journey.");

        System.out.println("We start your adventure in the city of Nova Karma.\nAs a hero,"
                + " it is your duty to " + "help people around the city and gain Reputation with"
                + " each good deed.\nI just saw " + "someone who needs help pushing their car,"
                + " lets go help!");

        System.out.println(
                "To succesfully help and gain Rep, answer the following:\n" + " What's 2+2 = ?");
        int pushtheCar = scan.nextInt();
        // if/else statement execute if input is true for said block of code
        if (pushtheCar == 4) {
            Player.setRep(Player.getRep() + 1);
            System.out.println(
                    "Nice! You helped the civilian! Your Rep grows everytime" + " you succeed!");
            System.out.println("Rep: " + Player.getRep());
        } else {
        	Player.setRep(Player.getRep() - 1);
            System.out.println("You have failed but there's always next time!\n Rep:" + Player.getRep());
        }

        // math.pow is used to increase the skills of a character that'll be
        // used in
        // later code to determine other factors
        // here i casted type int since math.pow uses doubles
        // operator precedence is important here because strength would not
        // increment
        // before it was squared if the ++ was behind strength
        Player.setPower((int)Math.pow(Player.getPower() + 1, 2));
        System.out.println("If an activity is very physically challenging or mentally "
                + "straining and you succeed," + " your skills might also increase exponentially!"
                + "\nThis time, helping the civilian increased your" + " Strength!" + "\nStrength: "
                + Player.getPower());
        System.out.println("A criminal is running away from the police! "
                + "Time for some vigilante heroism! The only way to catch "
                + "them is to sprint at full force!\nInput a number that is "
                + "bigger than 10 but less"
                + " than 50 and is an even number to catch the perpetrator!");
        int catchBadGuy = scan.nextInt();
        int even = catchBadGuy % 2;
        if (catchBadGuy > 10) {
            if (catchBadGuy < 50) {
                if (even == 0) {
                	Player.setSpeed((int)Math.pow(Player.getSpeed() + 1, 2));
                    Player.setRep(Player.getRep() + 3);
                    System.out
                            .println("Good job! You caught the criminal and became" + " a stronger "
                                    + "hero! \n Agility : " + Player.getSpeed() + "\n Rep: " + Player.getRep());

                } else {
                    Player.setRep(Player.getRep() - 1);
                    System.out.println("You almost had him, but he just slipped "
                            + "away! He won't get away next time!\n " + "Rep: " + Player.getRep());
                }

            } else {
                Player.setRep(Player.getRep() - 3);
                System.out.println("You ran so fast that you went passed him and"
                        + " slammed into a" + " wall! Maybe you have super agility"
                        + " and need to learn how to control" + " it!\n Rep: " + Player.getRep());

            }
        } else {
            System.out.println("He got away! Maybe your Agility is too low. Do not be "
                    + "dismayed, there are plenty of " + "oppertunities waiting!\n Rep: "
                    + Player.getRep());
        }

        System.out.println("oh no....." + "There's a meteor crashing into the Earth!"
                + " Activate the Comet Cannon by answering this riddle!"
                + " I am a symbol. \nA number that is always bigger, with no "
                + "definite end. " + "What am I?");
        scan.nextLine();
        // user inputs correct answer no matter what lettercase
        String userAnswer = scan.nextLine();
        userAnswer.trim();
        // goes to separate method and sets final mission

        //Reputation = UltimateCannon.theUltimateAnswer(userAnswer, Reputation, userName);

        // System.out.println("More missions are coming your way!");

        String trueHero = HeroRanking.TheHeroRank(Player.getRep());
        System.out.println("You are " + Player.getName() + " and you are a " + trueHero + "!");

        System.out.println("This is the Post Game that goes through different coding concepts that"
                + "weren't covered in the main program.");
        System.out.println("Here is an example of a while loop and right after, a do-while loop");
        
        DoWhileandWhile.MathBuddies();

        DoWhileandWhile.PlugAndChug();

        System.out.println("This next part will tackle exception handling.");

        int inputA;
        int inputB;

        boolean perfectinput = false;

        while (perfectinput == false) {
            System.out.println("Enter first number");
            try {
                inputA = scan.nextInt();
                System.out.println("Enter second number");
                inputB = scan.nextInt();
                int mathinput = inputA / inputB;
                System.out.println("Your first input divided by your second input as an int " + "is "
                        + mathinput + ".");
                perfectinput = true;
            } catch (InputMismatchException notAnInt) {
                System.out.println("Requires an integer, please try again.");
                scan.nextLine();
            } catch (ArithmeticException dividedByZero) {
                System.out.println(
                        "You cannot divide by zero, please input a different second " + "integer.");
                scan.nextLine();
            }
        }

        System.out.println("This next portion will cover polymorphism and inheritance!");

        Penguin Larry = new Penguin();
        Larry.AnimalSpecies();
        Larry.SpeciesNoise();
        Larry.PenguinSwims();

        System.out.println("The above text is all inheritance and polymorphism from "
                + "the derived class Animal to the class Penguin.");
        
        ArrayList<String> groceries = new ArrayList<String>();   
        groceries.add("Eggs");
        groceries.add("Milk");
        groceries.add("Bread");
        groceries.add("Chocolate Chip Cookies");
        int pos = groceries.indexOf("Eggs");
        int size = groceries.size();
        String item = groceries.get(2);
        for (int i = 0; i < groceries.size(); i++) {
            System.out.println("Index: " + i + " - Item: " + groceries.get(i));
        }
        for (String str : groceries) {
            System.out.println("Item is: " + str);
        }
        System.out.println("The position of Eggs in the ArrayList is "+ pos +", and the "
                + "total size of the ArrayList is "+ size+ " and using the get method,"
                        + " we can pick an item in the ArrayList like " + item+".");
        
        System.out.println("This concludes my minigame and coding project, however, I would like "
                + "to thank you for coming along this learning journey with me. With "
                + "hardwork, my programming skills can only improve! Thank you and goodbye.");


        scan.close();

    }

}
