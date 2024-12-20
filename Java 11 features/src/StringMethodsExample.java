public class StringMethodsExample {
    public static void main(String[] args) {
        
        // Sample text for demonstration
        String text = "   \u2001Hello World\u2001   ";
        
        // 1. isBlank() - Checks if the string is empty or contains only whitespace
        System.out.println("isBlank() Example:");
        System.out.println("Is the string blank? " + text.isBlank()); // true if empty or only whitespace
        String s1 = " ";
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());
        
        // 2. lines() - Converts the string into a stream of lines
        System.out.println("\nlines() Example:");
        String multilineText = "Hello\nWorld\nJava 11";
        System.out.println("String as lines:");
        multilineText.lines().forEach(System.out::println); // Prints each line separately
        
        // 3. repeat() - Repeats the string a specified number of times
        System.out.println("\nrepeat() Example:");
        String repeatText = "Java ";
        System.out.println("Repeating 'Java ' 3 times: '" + repeatText.repeat(3) + "'"); // Repeats the string 3 times
    }
}
