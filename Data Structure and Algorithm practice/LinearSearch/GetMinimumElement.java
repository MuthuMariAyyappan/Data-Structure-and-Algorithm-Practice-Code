package LinearSearch;
import java.util.*;

public class GetMinimumElement {
    public static void main(String[] args) {
       int[] arr={12,64,90,7,93};
    //    List<Integer> arr23 = new ArrayList<>(); 
       System.out.println("The Minimum number in arrray:"+minInArray(arr));
    }
    static int minInArray(int[] arr){
        int result = 0;
        int firstElement = arr[0];
       if(arr.length < 0){
        firstElement = -1;
       }
       else{
            for (int i : arr) {
                if(i < firstElement){
                    firstElement = i;
                }
            }
       }
       return firstElement;
    }
}
