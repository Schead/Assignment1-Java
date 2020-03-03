package Arrays;

import java.lang.reflect.Array;
import java.util.concurrent.ThreadLocalRandom;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++)
        {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 100);
            intArray[i] = randomNum;
        }

        int temp = 0;
        int slot = 0;

        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");

            for (int j = 0; j < intArray.length; j++)
            {
                if (intArray[j] >= temp)
                {
                    temp = intArray[j];
                    slot = j;
                }
            }
        }
        System.out.println();
        System.out.println("The largest value is " + temp);
        System.out.println("It is in slot " + slot);

    }
}
