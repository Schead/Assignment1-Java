package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WhereIsIt {
    public static void main(String[] args) {


        ArrayList al = new ArrayList(10);
        int randomNum = ThreadLocalRandom.current().nextInt(1, 50);
        for (int i = 0; i < 10; i++)
        {
            randomNum = ThreadLocalRandom.current().nextInt(1, 50);
            al.add(i, randomNum);
        }

        System.out.println( "ArrayList: " + al );
        Scanner in = new Scanner(System.in);
        System.out.println("Value to find: ");
        int value = in.nextInt();
        int temp = 0;
        int slot = 0;
        for (int i = 0; i < al.size(); i++)
        {
            for (int j = 0; j < al.size(); j++)
            {
                if ((int)al.get(j) == value)
                {
                    slot = j;
                }
            }
        }
        System.out.println();;
        System.out.println("It is in slot " + slot);
    }
}
