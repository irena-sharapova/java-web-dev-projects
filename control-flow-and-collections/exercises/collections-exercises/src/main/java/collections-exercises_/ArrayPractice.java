import java.util.Scanner;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        Integer[] anArray = {1, 1, 2, 3, 5, 8};
       // System.out.println(Arrays.toString(anArray));
        for ( int i=0; i < anArray.length; i++) {
            if (anArray[i]%2 == 0) {
                System.out.println(anArray[i]);
            }
        }
        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] strArray = myString.split(" ");
        //for (String word : strArray) {
        // System.out.println(word);
            System.out.println(Arrays.toString(strArray));

         String[] strArray2 = myString.split("\\.");
         System.out.println(Arrays.toString(strArray2));
        }

       // System.out.println(Arrays.toString(arrayName));
    }


