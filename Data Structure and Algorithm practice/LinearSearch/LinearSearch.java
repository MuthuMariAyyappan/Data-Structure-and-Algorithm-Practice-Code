package LinearSearch;
//From the array of String find the give string

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LinearSearch{

    public static void main(String[] args) {
        Long startTime = System.nanoTime();
        String[] arr = {"Maha","Lakshmi","Ayyappan","Visalakshi","Muthu","Mari"};
        String target=" ";
        String result = nameLinearSearch(arr,target);
        Long endTime = System.nanoTime();
        System.out.println("TIME TAKEN:"+ ( endTime - startTime));
        System.out.println("RESULT:"+result);

        
        // System.out.println("The Minimum number in arrray:"+minInArray(intArr));
    }

    //  static Integer minInArray(List<Integer> arr){
    //     Integer result = null;
    //     Collections.sort(arr);
    //     result = arr.get(0);
    //     return result;
    // }
    static String nameLinearSearch(String[] arr, String target){
        String res="";
       if(arr.length < 0){
            res = "The given array is empty cannot process further";
       }
       else{
            for(String str: arr){
                if(str.equalsIgnoreCase(target))
                    res = "The given element "+target+" present in the array";
                else
                    res = "The given element "+target+" not present in the array";
            }
       }
       return res;
    }
}