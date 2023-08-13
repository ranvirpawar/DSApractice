package arrays;
public class rotatearrary {
    static int[] rotatearrary(int [] nums, int n, int k){
        k = k%n;

        // creating the temp array to store the k elements in it

        int temp[] = new int[k];
        for(int i=0; i<k; i++){
            temp[i]= nums[n-k+i];
        } 

        // shifting the elements 

        for(int i=k; i<n; i++){
            nums[i-k]
        }

    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int n = nums.length;
        int k = 3;
        int [] rotatedarray = rotatearrary(nums, n, k);
        
    }

}
