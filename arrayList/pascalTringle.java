import java.util.*;
class pascaTringle{
    public static List<List<Integer>> generate(int numRows) {

        if(numRows==0){
            return new ArrayList();
        }

        List<Integer> result = new ArrayList<>();

        for(int i=1; i <numRows; i++){

            for( int j=0; j<i; j++){
                List<Integer> row = new ArrayList<>();
                if(j == 0 || j == i-1 ){
                    row.add(i);
                }
                else{
                    row.add(result.get(i-2).get(j) + result.get(-2).get(j-1)); 
                }


            }
        }
        
    }

    public static void main(String[] args) {
        int numRows = 5;
        generate(numRows);

    }
}