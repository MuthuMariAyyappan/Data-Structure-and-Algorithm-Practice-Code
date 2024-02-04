package BinarySearch;

import java.util.Arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,6,7 };
        int[] desarr ={9,8,7,6,6,5,9};
        String result = binarySearch(desarr, 6);
        System.out.println("The result:" + result);
    }

    static String binarySearch(int[] arr, int target) {
        String result = "";
        boolean sortAsc; 
        if (arr.length > 0) {
            if(arr[0] < arr[arr.length - 1]){
                sortAsc = true;
            }
            else if(arr[0] > arr[arr.length - 1]){
                sortAsc = false;
            }
            else{
               Arrays.sort(arr);
               sortAsc = true;
            }
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int middle = start + (end - start) / 2;
               if (arr[middle] == target) {
                    result = "The target " + target + " found in position " + (middle + 1);
                    break;
                }
                if(sortAsc){
                    if (arr[middle] > target) {
                        end = middle - 1;
                    } else if (arr[middle] < target) {
                        start = middle + 1;
                    } 
                }
                else{
                    if (arr[middle] > target) {
                        start = middle + 1;
                    } 
                    else if(arr[middle] < target){
                        end = middle - 1;
                    }
                }

            }
            if (result.isEmpty()) {
                result = "The target is not found";
            }
        }
        return result;
    }
}
