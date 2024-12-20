package StringJoiners;

public class WithoutStringJoiners {
    public static void main(String[] args) {

        String input = "I am software engineer";
        String[] words = input.split(" ");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");  // Add opening bracket

        for (int i = 0; i < words.length; i++) {
            stringBuffer.append(words[i]);

            // Add a comma after each word except the last one
            if (i < words.length - 1) {
                stringBuffer.append(",");
            }
        }

        stringBuffer.append("]");  // Add closing bracket

        System.out.println(stringBuffer);
    }
}
