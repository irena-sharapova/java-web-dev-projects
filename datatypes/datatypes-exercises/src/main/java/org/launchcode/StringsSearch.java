package org.launchcode;

import java.util.Scanner;

public class StringsSearch {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, "
                + "and of having nothing to do: once or twice she had peeped into the book her sister was reading, "
                + "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice "
                + "‘without pictures or conversation?’";

        String lowerCaseSentence = sentence.toLowerCase();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a search term: ");
        String searchTerm = input.nextLine().toLowerCase();

        boolean found = lowerCaseSentence.contains(searchTerm);

        if (found) {
            System.out.println("True: The term \"" + searchTerm + "\" was found in the sentence.");
            int index = lowerCaseSentence.indexOf(searchTerm);
            int length = searchTerm.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");

            String modifiedSentence = lowerCaseSentence.replace(searchTerm, "###");
            System.out.println(modifiedSentence);

        } else {
            System.out.println("False: The term \"" + searchTerm + "\" was not found in the sentence.");
        }

        // Close the Scanner
        input.close();
    }
}
