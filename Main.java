import java.util.ArrayList;
import java.util.InputMismatchException;
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
       
        Printer.printIntro();

        Scanner scan = new Scanner(System.in);
        
        Character Player = new Character();
        Player.setRep(0);
        
        String userName = scan.nextLine();
        Player.setName(userName.substring(0,1).toUpperCase() + userName.substring(1).toLowerCase());
        System.out.println("Luis: Hello " + Player.getName() + ", it's so nice to meet you!");

        System.out.println("What month is it? [Give your answer between 1 and 12.]");
        int month = scan.nextInt();
        String theMonth = Month_and_Year.setMonth(month);
        System.out.println("So it's " + theMonth + " but what year is it?");
        int year = scan.nextInt();
        System.out.println(
                "It's " + theMonth + " " + year + ", and now it's time to get this game started!");

        Player.explain_game_skills();

        System.out.println("Every game starts with a first mission. For this mission,"
                + " input a number bigger than 10 to continue!");
        double usernumInput = scan.nextDouble();
        if (usernumInput > 10.0) {
            System.out.println("Good job! There are more tasks ahead that you have to pass!");
        } else {
            System.out.println("You've failed the first mission!\nBut don't worry you'll"
                    + " have another chance.");
        }
        
        Printer.print_mission_prelude();
        Printer.print_mission_one();
        int pushtheCar = scan.nextInt();
        Missions.do_mission_one(Player, pushtheCar);
        Printer.print_mission_two();
        int catchBadGuy = scan.nextInt();
        Missions.do_mission_two(Player, catchBadGuy);
        
        System.out.println("oh no....." + "There's a meteor crashing into the Earth!"
                + " Activate the Comet Cannon by answering this riddle!"
                + " I am a symbol. \nA number that is always bigger, with no "
                + "definite end. " + "What am I?");
        scan.nextLine();
        // user inputs correct answer no matter what lettercase
        String userAnswer = scan.nextLine();
        userAnswer.trim();
        
        UltimateCannon.theUltimateAnswer(userAnswer, Player);

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
