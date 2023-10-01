import java.util.Stack;

class removeOutermostParenthesis{
    public static void main(String[] args) {
        String s = "(()())(())";
        // output should be "()()()"
        
        // creating stack to check if bracket is open or close 
     Stack<Character> stack = new Stack<>();
    //sb for ans
     StringBuilder sb = new StringBuilder("");

     for(int i=0; i<s.length(); i++){
         if(s.charAt(i)=='('){
             if(stack.size() > 0){
                 sb.append(s.charAt(i));
             }
            stack.push(s.charAt(i));

         }else{
             stack.pop();
             if(stack.size()>0){
                 sb.append(s.charAt(i));
             }
         }
     }
      //return sb.toString();
    }
  
}