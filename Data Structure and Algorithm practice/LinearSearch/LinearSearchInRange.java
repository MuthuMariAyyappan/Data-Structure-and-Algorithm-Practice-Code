package LinearSearch;
//From the array of String find the give string from given range(between specified indexes)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LinearSearchInRange{

    public static void main(String[] args) {
        Long startTime = System.nanoTime();
        String[] arr = {"Maha","Lakshmi","Ayyappan","Visalakshi","Muthu","Mari"};
        String target="Visalakshi";
        String result = nameLinearSearch(arr,target,0,5);
        List<Integer> intArr = new ArrayList<>();
        intArr.add(23);
        intArr.add(64);
        intArr.add(72);
        intArr.add(6);
        // System.out.println("The Minimum number in arrray:"+minInArray(intArr));
        Long endTime = System.nanoTime();
        System.out.println("TIME TAKEN:"+ ( endTime - startTime));
        System.out.println("RESULT:"+result);
    }

    static Integer minInArray(List<Integer> arr){
        Integer result = null;
        Collections.sort(arr);
        result = arr.get(0);
        return result;
    }

    static String nameLinearSearch(String[] arr, String target,int startIndex,int endIndex){
        String res="";
       if(arr.length < 0){
            res = "The given array is empty cannot process further";
           
       }
       else{
           for(int i = startIndex;i <= endIndex; i++ ){
                if(arr[i].equalsIgnoreCase(target))
                {
                    res = "The given element "+target+" present in the array";
                    break;
                }
                else
                    res = "The given element "+target+" not present in the array";
            }
       }
       return res;
    }
}