package Reduce;

import java.util.Arrays;
import java.util.OptionalInt;

public class ReduceExamplewithInitialValue {
    public static void main(String[] args) {
        int arr[] = {1, 45, 3, 2};

        OptionalInt sum1 = Arrays.stream(arr).reduce(Integer::sum);

        // Use ifPresent to print the sum if it exists, otherwise print 0
        if (sum1.isPresent()) {
            System.out.println("Addition of numbers using Method Reference: " + sum1.getAsInt());
        } else {
            System.out.println("Addition of numbers using Method Reference: 0");
        }

        OptionalInt sum = Arrays.stream(arr).reduce( (a, b) -> a + b);

        // Use ifPresent to print the sum if it exists, otherwise print 0
        if (sum.isPresent()) {
            System.out.println("Addition of numbers using Method Reference: " + sum.getAsInt());
        } else {
            System.out.println("Addition of numbers using Method Reference: 0");
        }
    }
}
