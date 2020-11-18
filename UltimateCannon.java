
public class UltimateCannon {

    /**
     * @LuisD.Hernandez
     * @param userAnswer - accepts the parameter to be used in if statement and
     *                   gives an output
     * @param Reputation - reputation is changed depending on the answer provided
     * @param userName   -method accepts parameter to be used to printed out at the
     *                   end
     * @return Reputation to be used in the final calculation of HeroRanking
     */
    public static int theUltimateAnswer(String userAnswer, int Reputation, String userName) {
        // infinity has 8 char
        int theAnswerFromPlayer = userAnswer.length();

        if (theAnswerFromPlayer == 8) {
            Reputation += 4;
            System.out.println("Amazing! You did it! The meteor was blown to pieces! "
                    + "You saved " + "the Earth! Thank you, " + userName + "!");
        } else {
            System.out.println("It's too late.... we're done for!!!");
            Reputation -= 4;
        }
        return Reputation;

    }
}
