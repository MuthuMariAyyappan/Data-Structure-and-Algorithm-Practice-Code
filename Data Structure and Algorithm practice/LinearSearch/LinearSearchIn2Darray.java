package LinearSearch;
public class LinearSearchIn2Darray {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6,7,8},
            {9,10}
        };
    System.out.println("The Result:"+ searchElement(arr,1));
    }

    private static String searchElement(int[][] arr, int target) {
        String result = "The given element is not present";     

        if (arr.length < 0) {
            result = "The given array is empty";
        } else {
            for (int[] a : arr) {
                for (int element : a) {
                    if (element == target) {
                        result = "The given element " + target + " is present";
                        break; 
                    }
                }
            }
        }

        return result;
    } 
}
