
public class DoWhileandWhile {

    public static void MathBuddies() {
        double counter = 10.0;
        while (counter < 50.0) {
            double xyz = 2;
            double function = (counter / xyz) + Math.pow(counter, xyz) - xyz;
            counter += 20;
            System.out.println("The adder is equal to " + function + ".");
        }
    }

    public static void PlugAndChug() {
        int plug = 12;
        int chug = 5;
        int keepgoing = 0;
        do {
            int function2 = (plug * 2 + (chug * chug)) + 1;
            int Adder = 0;
            Adder += function2;
            keepgoing++;
            System.out.println("The Adder is " + Adder + ", after the " + keepgoing + "(st)/(nd)/"
                    + "(rd)/(th)" + " loop.");
        } while (keepgoing < 5);

    }

}
