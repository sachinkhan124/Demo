package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    // Function to reverse the array in-place
    public static void reverseArray(Integer[] arr) {
    	
    List<Integer> reversearray =Arrays.asList(arr);	
       Collections.reverse(reversearray);
//        int start = 0;
//        int end = arr.length - 1;
//
//        // Swap the elements from start to end
//        while (start < end) {
//            // Swap the elements at start and end
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            // Move towards the center
//            start++;
//            end--;
//        }
    }

    public static void main(String[] args) {
        // Sample array
        Integer[] arr = {1, 2, 3, 4, 5, 6};

        // Display original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Reverse the array
        reverseArray(arr);

        // Display reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
