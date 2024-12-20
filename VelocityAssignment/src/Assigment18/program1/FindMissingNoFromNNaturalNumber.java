package Assigment18.program1;

/*1. Suppose You have given an integer array containing 1 to n but one of the number from 1 to n in the array is missing.
You need to provide optimum solution to find the missing number. Number can not be repeated in the array.*/



public class FindMissingNoFromNNaturalNumber {
    
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15};
        int j=0;
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum = sum + arr[i];
            j=i;
        }
        int n=arr[j];
       // System.out.println(n);
      int total_sum=(n*(n+1))/2;
        int missing_no=total_sum-sum; 
       // System.out.println("Sum of array elements: " + sum);
        System.out.println("Missing number: " + missing_no);
    }
}
