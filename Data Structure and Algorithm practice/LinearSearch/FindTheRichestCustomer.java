package LinearSearch;
//From the given m X n array named account where account[i] represent the individual customer and
// account[i][j] represent the wealth of the ith customer in each bank accountk , we have to find who is the 
//richest customer from the given array

/*
 example:

    input: 
        [[1,2,3],[4,6],[5,2,7]]
    process: [6,10,14]
       customer 1: 1 + 2 + 3 = 6
       customer 2: 4 + 6     = 10
       customer 3: 5 + 2 + 7  = 14
    output: 
        The richest customer is Customer 3 with wealth 14
    
 */
public class FindTheRichestCustomer {
    public static void main(String[] args) {
        int[][] account
         = {
            {1, 2, 3},
            {4, 6},
            {5}
        };
        String result = findRichestCustomer(account);
        System.out.println("The Result: "+result);
    }

    static String findRichestCustomer(int[][] arr){
        String result="";
        int[] wealth = new int[arr.length];
       
        if(arr.length < 0)
        {
            result = "The data is empty";
        }
        else{
            for(int row = 0 ; row < arr.length; row ++){
                 int eachCustomerWealth = 0;
                for(int col = 0; col < arr[row].length; col ++){
                   eachCustomerWealth = eachCustomerWealth + arr[row][col];
                }
                wealth[row] = eachCustomerWealth;
            }
            int maxWealth = wealth[0];
            for(int w:wealth){
             if(w > maxWealth){
                maxWealth = w;
             }   
            }
            result = "The richest customer has "+ maxWealth;
        }
       
        return result;
    }
    
}
