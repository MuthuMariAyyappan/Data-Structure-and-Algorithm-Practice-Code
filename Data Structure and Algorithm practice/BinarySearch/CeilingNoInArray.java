// In a sorted array, the ceiling of a value is the smallest element in the array that is greater than or equal to that value. The ceiling is the lower bound of the value. 
// For example, if n=6, x=5, and a=[3, 4, 7, 8, 8, 10], then the floor and ceiling of x are 4 and 7, respectively


package BinarySearch;

import java.util.Arrays;

public class CeilingNoInArray {
    public static void main(String[] args) {
        System.out.println("test");
        // int[] arr = { 50,40,30,20,10}; //descending order
        int[] arr = {5, 2, 1, 7, 4, 8, 3};
        
        // int[] arr = { 2, 4, 5, 53, 67, 88, 89, 90 }; //ascending order
        String result = findCeilingInArray(arr, 1);
        System.out.println("RESULT: " + result);
    }

    static String findCeilingInArray(int[] arr, int target) {
        String result = "";
        if (arr.length > 0) {
        boolean isAscending = false;
        boolean isDescending = false;
        if(arr[0] < arr[arr.length - 1] && arr[1] < arr[arr.length -2])
        {
            isAscending = true;
        }
        else if(arr[0] > arr[arr.length - 1] && arr[1] > arr[arr.length -2]){
            isDescending = true;
        }
        else{

           Arrays.sort(arr);
           isAscending= true;
           System.out.println("Unsorted arr"+arr);
        }
       
            int start = 0;
            int end = arr.length - 1;

        if(isAscending){
            while (start <= end) {
                int middle = start + (end - start) / 2;

                if (arr[middle] < target) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                   }
            }

                if (start < arr.length) {
                    result = "Ceiling of " + target + " is " + arr[start];
                } else {
                    result = "Ceiling of " + target + " does not exist in the array";
                }
            }
            else if(isDescending){
                while(start <= end){
                    int middle = start + (end - start) / 2;

                    if(arr[middle] < target){
                        end = middle - 1;
                    }
                    else{
                        start = middle + 1;
                    }
                }
                if(end < arr.length){
                    result = "Ceiling of " + target + " is " + arr[end];
                } else {
                    result = "Ceiling of " + target + " does not exist in the array";
                }
            }
            // }
        } else  {
            result = "The given array is empty";
        }
        
        return result;
    }
}
