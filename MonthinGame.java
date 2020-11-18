
public class MonthinGame {
    /**
     * @author LuisD.Hernandez
     * @param month - takes in the input of the user to select a month in the switch
     *              statement
     * @return theMonth - returns the string value of the integer inputed and uses
     *         it to show a date
     */

    public static String TimeOfTheYear(int month) {

        String theMonth;

        switch (month) {
            case 1:
                theMonth = "January";
                break;
            case 2:
                theMonth = "February";
                break;
            case 3:
                theMonth = "March";
                break;
            case 4:
                theMonth = "April";
                break;
            case 5:
                theMonth = "May";
                break;
            case 6:
                theMonth = "June";
                break;
            case 7:
                theMonth = "July";
                break;
            case 8:
                theMonth = "August";
                break;
            case 9:
                theMonth = "September";
                break;
            case 10:
                theMonth = "October";
                break;
            case 11:
                theMonth = "November";
                break;
            case 12:
                theMonth = "December";
                break;
            default:
                theMonth = "invalid month my guy.";
                break;
        }
        return theMonth;
    }

}
