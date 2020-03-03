package ArrayLists;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(10);
        int randomNum = ThreadLocalRandom.current().nextInt(1, 100);
        for (int i = 0; i < 10; i++)
        {
            randomNum = ThreadLocalRandom.current().nextInt(1, 100);
            al.add(i, randomNum);
        }

        System.out.println( "ArrayList: " + al );

    }
}
