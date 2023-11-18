class Solution{
    static String oddEven(int N){
        // code here
        if ((N & 1) == 1) {
            return "odd";
        } else {
            return "even";
        }
    }
}
public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        int no =0;
        for(int i=0; i<arr.length;i++){
             no^=arr[i];
        }
        return no;
        // for(int n : arr){
        //     no ^= n
        // }
        // return -1;
    }
}
