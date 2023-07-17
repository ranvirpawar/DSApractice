package arrays;
public class greatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> a = new ArrayList();
        int maxCandies = Arrays.stream(candies).max().getAsInt;
        for(int i=0; i<candies.length; i++){
            int sum = candies[i] + extraCandies;
            if (sum >= maxCandies){
                a.add(true);
            }
            else{
                a.add(false);
            }
        }
        return a ;
    
    }
    public static void main(String[] args) {
        int [] candies = {4,2,1,1,2};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
System.out.println(result);
    }
}
