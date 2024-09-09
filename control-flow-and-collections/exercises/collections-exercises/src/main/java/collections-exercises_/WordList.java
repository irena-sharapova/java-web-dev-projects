import java.util.ArrayList;

public class WordList {
   /* public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    } */

   public static void printWords (ArrayList<String> words) {
       for (String word : words) {
           if (word.length() == 5) {
               System.out.println(word);
           }
       }
   }

   public static void main(String[] args) {
       ArrayList<String> wordList = new ArrayList<>();
       wordList.add("cats");
       wordList.add("dogs");
       wordList.add("parrot");
       wordList.add("horse");
       wordList.add("pig");
       wordList.add("hamster");

       printWords(wordList);
   }
}
