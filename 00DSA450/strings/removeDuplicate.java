Remove all duplicates from a given string

Str = geeksforgeeks
Output: geksfor


class Solution {
    String removeDuplicates(String str) {
        // code here
        Map <Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        
        String ans ="";
        for(Map.Entry <Character, Integer> ele : map.entrySet()){
            ans += ele.getKey();
        }
        return ans;
        
    }
}
