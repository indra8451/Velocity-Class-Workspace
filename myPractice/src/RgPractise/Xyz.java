package RgPractise;

import java.util.HashSet;
import java.util.Set;

public class Xyz {

    public static void main(String[] args) {
        String name = "vvvvvtttdsegjfj";
        int count = 0;
        int length = name.length();
        int arr[] = new int[length];
        Set<Character> charPrint = new HashSet<>();  // Set to track printed characters

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            char ch1 = Character.toLowerCase(ch);  // Convert to lowercase
            count = 0;

            for (int j = 0; j < name.length(); j++) {
                char ch2 = Character.toLowerCase(name.charAt(j));  // Also convert ch2 to lowercase
                if (ch1 == ch2) {
                    count++;
                }
            }
            arr[i] = count;
        }

        System.out.println("Count of each character: ");
        for (int l = 0; l < name.length(); l++) {
            char ch = name.charAt(l);
            char ch1 = Character.toLowerCase(ch);

            if (charPrint.contains(ch1)) {
                continue; // Skip printing if the character has already been printed
            } else {
                System.out.println(name.charAt(l) + " " + arr[l]);
                charPrint.add(ch1); // Add the character to the set after printing
            }
        }
    }
}
