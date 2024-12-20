package RgPractise;

import java.util.Arrays;

public class DeepCloneExample implements Cloneable {
    private int[] data;

    public DeepCloneExample(int[] data) {
        this.data = data;
    }

    // Method to create a deep clone
    public DeepCloneExample deepClone() {
        try {
            // Step 1: Call the clone method from the superclass (Object)
            Object clone = super.clone();

            // Step 2: Cast the shallow copy (which is of type Object) to DeepCloneExample
            DeepCloneExample deepCloneExample = (DeepCloneExample) clone;

            // Step 3: Perform a deep copy of the mutable field (data array)
            // Clone the data array and assign it to the cloned instance's data field
            deepCloneExample.data = this.data.clone();

            // Step 4: Return the deep cloned instance
            return deepCloneExample;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should not happen, since we are Cloneable
        }
    }

    public static void main(String[] args) {
        int[] originalData = {1, 2, 3}; // Create an int array
        DeepCloneExample original = new DeepCloneExample(originalData); // Create an instance of DeepCloneExample

        // Create a deep clone using the custom deepClone method
        DeepCloneExample deepCloneExample = original.deepClone();

        // Modify the data in the cloned object
        deepCloneExample.data[0] = 99; // Change only affects the clone

        // Print the original object's data array
        System.out.println("Original: " + Arrays.toString(original.data)); // Shows [1, 2, 3]

        // Print the cloned object's data array
        System.out.println("Clone: " + Arrays.toString(deepCloneExample.data)); // Shows [99, 2, 3]
    }
}
