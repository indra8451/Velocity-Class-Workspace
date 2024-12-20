package StringJoiners;

import java.util.StringJoiner;

public class WithStringJoiner {
    public static void main(String[] args) {

        String input = "I am software engineer";
        String[] words = input.split(" ");

        // Create a StringJoiner with a comma delimiter
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");

        // Add each word to the StringJoiner
        for (String word : words) {
            stringJoiner.add(word);
        }

        // Convert StringJoiner to a string and print
        System.out.println(stringJoiner);
    }
}
