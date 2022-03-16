import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] myArray = {10,2,6,1,7,0};
        boolean isSorted = false;
        int a;
        while (!isSorted){
            isSorted = true;
        for (int i = 0; i < 5; i++ ) {
            if (myArray[i] > myArray[i + 1]) {
                isSorted = false;
                a = myArray[i];
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = a;
                System.out.println(Arrays.toString(myArray));
            }
        }
        }
        System.out.println(Arrays.toString(myArray));

    }

}
