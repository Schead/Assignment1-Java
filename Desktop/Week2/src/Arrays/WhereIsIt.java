package Arrays;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WhereIsIt {
    public static void main(String[] args) {

        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++)
        {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 50);
            intArray[i] = randomNum;
        }

        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Value to search: ");
        int nSearch = in.nextInt();


        for (int j = 0; j < intArray.length; j++)
        {
            if (nSearch == intArray[j])
            {
                System.out.println(nSearch + " is in slot " + j);
            }
        }

    }

}
