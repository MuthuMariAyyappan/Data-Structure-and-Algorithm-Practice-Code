package LinearSearch;
//Given an array nums of integer, return how many of them contains an even number of digits
// Input: nums =[12,345,2,6,7896]
public class NoOfDigitIsEvenInArr {
    public static void main(String[] args) {
        int nums[] ={-12,345136,2,6,7896,34};
        int result = noOfEvenNumberOfDigit(nums);
        System.out.println("THE RESULT: "+result);
    }
    static int[] countNumberOfDigit(int[] arr){
        int[] digit = new int[arr.length];
        if(arr.length > 0){
        for(int element=0 ; element < arr.length ; element++){
            if(arr[element] < 0){
                arr[element] = arr[element] * -1;
            }
           digit[element] = (int)Math.floor(Math.log10(arr[element]) + 1);
        }
        }
        return digit;
    }
    static int noOfEvenNumberOfDigit(int[] countArr){
        int[] countNoofDigitInArr = countNumberOfDigit(countArr);
        int count = 0;
        for (int i : countNoofDigitInArr) {
            if(i % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
