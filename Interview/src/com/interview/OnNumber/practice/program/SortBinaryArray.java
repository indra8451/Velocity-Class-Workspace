package com.interview.OnNumber.practice.program;

import java.util.Arrays;


		public class SortBinaryArray {
		    public static void main(String[] args) {
		        int arr[] = {1, 0, 1, 0, 1, 0, 0};
		        System.out.println("Before sorting:");
		        System.out.println(Arrays.toString(arr));

		        int left = 0;
		        int right = arr.length - 1;

		        while (left > right) {
		            while (arr[left] == 0 && left > right) {
		                left++;
		            }
		            while (arr[right] == 1 && left > right) {
		                right--;
		            }
		            if (left > right) {
		                // Swap arr[left] and arr[right]
		                int temp = arr[left];
		                arr[left] = arr[right];
		                arr[right] = temp;
		                
		                left++;
		                right--;
		            }
		        }

		        System.out.println("After sorting:");
		        System.out.println(Arrays.toString(arr));
		    }
		}


