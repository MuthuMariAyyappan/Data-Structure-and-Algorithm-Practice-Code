package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.print("232223323223");
        int[] arr={2,6,23,55,54,64,2};
        String result = binarySearch(arr,77);
        System.out.println("The result:"+result);
    }

    static String binarySearch(int[] arr, int target){
        String result = "";
        int start = 0;
        int end = arr.length  - 1;
        while(start <= end){
            int middle = start + (end - start) / 2;
           if(arr[middle] > target){
                end = middle - 1;
            }
            else if(arr[middle] < target){
                start = middle + 1;
            }
            else if(arr[middle] == target){
                result = "The target "+target+" found in index" + middle;
                break;
            }
           

        }
        if(result.isEmpty()){
            result = "The target is not found";
        }
        return result;
    }
}
