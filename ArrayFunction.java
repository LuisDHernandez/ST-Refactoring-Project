
public class ArrayFunction {
    /**
     * @author LuisD.Hernandez
     * @param Reputation - this variable gets added in a for loop and helps find an
     *                   average and sum of the integers
     */

    public static void projectArray(int Reputation) {
        int[] BonusArray = { Reputation };
        int sum = 5;
        for (int i = 0; i < BonusArray.length; i++) {
            sum += BonusArray[i];
        }
        System.out.println("The sum of the array with your Reputation is : " + sum);
        int avgSum = sum / BonusArray.length;
        System.out.println("The average between them is : " + avgSum);
    }
}
