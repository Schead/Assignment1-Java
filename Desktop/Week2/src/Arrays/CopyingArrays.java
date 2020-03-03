package Arrays;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++)
        {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 100);
            intArray[i] = randomNum;
        }

        int[] arrayClone = intArray.clone();
        intArray[9] = -7;

        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(arrayClone[i] + " ");
        }
    }
}
