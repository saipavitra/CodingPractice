package practice;

import java.util.Arrays;
public class SecondLargestUsingSorting {


	    public static int findSecondLargest(int[] array) {
	    	// Initialize these to the smallest value possible
	        int highest = Integer.MIN_VALUE;
	        int secondHighest = Integer.MIN_VALUE;
	 
	        // Loop over the array
	        for (int i = 0; i < array.length; i++) { 
	            // If current element is greater than highest 
	            if (array[i] > highest) {
	 
	                // assign second highest element to highest element 
	                secondHighest = highest;
	 
	                // highest element to current element
	                highest = array[i];
	            } else if (array[i] > secondHighest && array[i]!=highest)
	                // Just replace the second highest
	                secondHighest = array[i];
	        }
	 
	        // After exiting the loop, secondHighest now represents the second
	        // largest value in the array
	        return secondHighest;
	    }
	 
	    public static void main(String[] args) {
	        int[] arr = {45, 53, 22, 89, 77, 98, 94};
	        int result = findSecondLargest(arr);
	        System.out.println("The second largest number is: " + result);
	    }
	}
