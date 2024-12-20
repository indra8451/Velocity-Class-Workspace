package com.interview.OnNumber.practice.program;

import java.util.Scanner;

public class Binary {

    public void convertBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = scanner.nextInt();
        int originalNum = num;  // Save the original number for final output
        int count = 0;
        StringBuilder binaryRepresentation = new StringBuilder();

        while (num != 0) {
            int rem = num % 2;
            binaryRepresentation.append(rem);

            if (rem == 0) {
                count++;
            }

            num = num / 2;
        }

        // Reverse the binary string because we've built it backwards
        binaryRepresentation.reverse();

        System.out.println("Binary representation: " + binaryRepresentation);
        System.out.println("Count of 0s in the binary representation of " + originalNum + " is: " + count);
    }

    public static void main(String[] args) {
        Binary binary = new Binary();
        binary.convertBinary();
    }
}
