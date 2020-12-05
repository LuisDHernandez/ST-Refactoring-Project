
public class HeroRanking {
    /**
     * 
     * @param Reputation - reputation is used to determine the hero rank of the user
     *                   in the game
     * @return - The_HERO_RANK that is used to be printed out as the users hero rank
     *         and is not changeable
     */
    public static String set_Hero_Rank(int Reputation) {
        // this statement will expand to cover other hero ranks and assign a
        // title to them like Super-Hero
        String HeroRank = " ";
        if (Reputation > 0) {
            if (Reputation >= 5) {
                HeroRank = "Super-Hero";
            } else {
                HeroRank = "Civilian";
            }
        } else if (Reputation >= -5) {
            HeroRank = "Criminal";
        } else {
            HeroRank = "Super-Villain";
        }
        final String THE_HERO_RANK = HeroRank;
        return THE_HERO_RANK;
    }
}