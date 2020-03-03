package Arrays;

import java.util.concurrent.ThreadLocalRandom;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        int slot = 0;
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++)
        {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 100);
            intArray[i] = randomNum;
        }

        int temp = 0;

        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");

            for (int j = 0; j < intArray.length; j++)
            {
                if (intArray[j] > temp)
                {
                    temp = intArray[j];
                }
            }
        }
        System.out.println();
        System.out.println("The largest value is " + temp);
    }
}
