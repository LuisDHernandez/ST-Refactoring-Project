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
	int calculateBadGuyWin(int num){
		return num;
		}

    public static void main(String[] args) {
    	

        // sysout ctrl spacebar = system.out.println();
        /*
         * Java uses data types like byte, char, integer, double, short, long and float
         * and commonly the class String bytes are 8 bit memory and hold values between
         * -128 to 127 integers are much bigger holders for numbers shorts are for small
         * numbers long are for very large numbers that require more space float and
         * double create space in memory for fractional numbers and components Strings
         * and char are character value(s) stored as letters
         */
        // this is a method call but with no arguments and with a separate class
        // from
        // Main
        Introduction.printIntro();

        Scanner scan = new Scanner(System.in);
        // wait for user to type their name
        String userName = scan.nextLine();
        userName = userName.substring(0, 1).toUpperCase() + userName.substring(1);
        System.out.println("Luis: Hello " + userName + ", it's so nice to meet you!");
        // variable is a space in memory allocated for what we assign to it
        // being any
        // value
        // scope is code that falls inside the curly braces of classes and
        // methods and
        // if/else
        // statements.they are inside the entirety of the class or in just some
        // smaller
        // class

        // use of switch to print out month and year
        System.out.println("What month is it? [Give your answer between 1 and 12.]");
        int month = scan.nextInt();
        String theMonth;
        // switch is helpful to solve for multiple situations

        MonthinGame.TimeOfTheYear(month);
        theMonth = MonthinGame.TimeOfTheYear(month);
        System.out.println("So it's " + theMonth + " but what year is it?");
        int year = scan.nextInt();
        System.out.println(
                "It's " + theMonth + " " + year + ", and now it's time to get this game started!");

        System.out.println("Luis: All characters have different skills that are randomly "
                + "generated :" + " Strength, Agility, Intelligence, and Stamina.");
        // random number generator gives skills a value
        // this skills will increment or decrement with activities that happen
        // in the
        // code
        Random randomSkill = new Random();
        // i love VanSelow
        // and chocolates

        int Strength = randomSkill.nextInt((10)) + 1;
        int Agility = randomSkill.nextInt((10)) + 1;
        int Intelligence = randomSkill.nextInt((10)) + 1;
        int Stamina = randomSkill.nextInt((10)) + 1;

        System.out.println("Your skill levels are: \n Strength: " + Strength + " \n Agility: "
                + Agility + "\n Intelligence: " + Intelligence + "\n Stamina: " + Stamina);

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
        // reputation will be a deciding factor when determining hero rank at
        // the end of
        // the minigame
        int Reputation = 0;

        System.out.println(
                "To succesfully help and gain Rep, answer the following:\n" + " What's 2+2 = ?");
        int pushtheCar = scan.nextInt();
        // if/else statement execute if input is true for said block of code
        if (pushtheCar == 4) {
            Reputation++;
            System.out.println(
                    "Nice! You helped the civilian! Your Rep grows everytime" + " you succeed!");
            System.out.println("Rep: " + Reputation);
        } else {
            Reputation--;
            System.out.println("You have failed but there's always next time!\n Rep:" + Reputation);
        }

        // math.pow is used to increase the skills of a character that'll be
        // used in
        // later code to determine other factors
        // here i casted type int since math.pow uses doubles
        // operator precedence is important here because strength would not
        // increment
        // before it was squared if the ++ was behind strength
        Strength = (int) Math.pow(++Strength, 2);
        System.out.println("If an activity is very physically challenging or mentally "
                + "straining and you succeed," + " your skills might also increase exponentially!"
                + "\nThis time, helping the civilian increased your" + " Strength!" + "\nStrength: "
                + Strength);
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
                    Agility = (int) Math.pow(++Agility, 2);
                    Reputation += 3;
                    System.out
                            .println("Good job! You caught the criminal and became" + " a stronger "
                                    + "hero! \n Agility : " + Agility + "\n Rep: " + Reputation);

                } else {
                    Reputation--;
                    System.out.println("You almost had him, but he just slipped "
                            + "away! He won't get away next time!\n " + "Rep: " + Reputation);
                }

            } else {
                Reputation -= 3;
                System.out.println("You ran so fast that you went passed him and"
                        + " slammed into a" + " wall! Maybe you have super agility"
                        + " and need to learn how to control" + " it!\n Rep: " + Reputation);

            }
        } else {
            System.out.println("He got away! Maybe your Agility is too low. Do not be "
                    + "dismayed, there are plenty of " + "oppertunities waiting!\n Rep: "
                    + Reputation);
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

        UltimateCannon.theUltimateAnswer(userAnswer, Reputation, userName);

        // System.out.println("More missions are coming your way!");
        Character Player = new Character(userName);
        Player.setName(userName);

        // System.out.println("You are: " + Player.getName() + ".");
        // String trueHero = HeroRanking.TheHeroRank(Reputation);
        // by combining the above code, it's more efficient and clean
        String trueHero = HeroRanking.TheHeroRank(Reputation);
        System.out.println("You are " + Player.getName() + " and you are a " + trueHero + "!");

        System.out.println("This is the Post Game that goes through different coding concepts that"
                + "weren't covered in the main program.");
        System.out.println("Here is an example of a while loop and right after, a do-while loop");
        DoWhileandWhile.MathBuddies();

        DoWhileandWhile.PlugAndChug();

        System.out.println("This next part will tackle exception handling.");
        // Exceptions code is below

        int inputA;
        int inputB;

        boolean perfectinput = false;

        while (perfectinput == false) {
            System.out.println("Enter first number");
            try {
                inputA = scan.nextInt();
                inputB = scan.nextInt();
                int mathinput = inputA / inputB;
                System.out.println("Your first input divided by your second input as an int " + "is"
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

        // Inheritance is where a class is derived from a based class and also shares
        // the same
        // fields from that parent class
        // "is a" relationship is a perfect example of inheritance (a cat is an animal)
        // the biggest benefit is being able to use extensive object oriented
        // programming
        // with just one block of code as the base

        System.out.println("This next portion will cover polymorphism and inheritance!");

        Penguin Larry = new Penguin();
        Larry.AnimalSpecies();
        Larry.SpeciesNoise();
        Larry.PenguinSwims();

        System.out.println("The above text is all inheritance and polymorphism from "
                + "the derived class Animal to the class Penguin.");
        
        ArrayList<String> groceries = new ArrayList<String>();   
        groceries.add("Eggs"); // adds item to the grocery list
        groceries.add("Milk");
        groceries.add("Bread");
        groceries.add("Chocolate Chip Cookies");
        int pos = groceries.indexOf("Eggs");  // gets the position that matches argument
        int size = groceries.size();  // returns the size 
        String item = groceries.get(2);  // returns element at index location 
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
