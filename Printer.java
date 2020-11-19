
public class Printer {

// this is a header for a method but no parameters

    public static void printIntro() {
        System.out.println("???: Welcome to my awesome program!");
        System.out.println("Luis: I am Luis Hernandez, your helper throughout this adventure! ");
        System.out.println("Let's build your character for this adventure!");
        System.out.println("Luis : What's your name?");

    }
    
    public static void print_mission_prelude() {
    	System.out.println("Lets get ready to start you on your journey.");
        System.out.println("We start your adventure in the city of Nova Karma.\nAs a hero,"
                + " it is your duty to " + "help people around the city and gain Reputation with"
                + " each good deed.\nI just saw " + "someone who needs help pushing their car,"
                + " lets go help!");
    }
    public static void print_mission_one() {
    	System.out.println("To succesfully help and gain Rep, answer the following:\n" + " What's 2+2 = ?");
    }
    public static void print_mission_two() {
    	System.out.println("A criminal is running away from the police! "
                + "Time for some vigilante heroism! The only way to catch "
                + "them is to sprint at full force!\nInput a number that is "
                + "bigger than 10 but less"
                + " than 50 and is an even number to catch the perpetrator!");
    }
    public static void print_final_mission() {
    	System.out.println("oh no....." + "There's a meteor crashing into the Earth!"
                + " Activate the Comet Cannon by answering this riddle!"
                + " I am a symbol. \nA number that is always bigger, with no "
                + "definite end. " + "What am I?");
    }
}
