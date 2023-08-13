
// 20. Valid Parentheses

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.


class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0) {
            return false;
        }

        // creating the stack 
        Stack <Character> stack = new Stack();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                // pushing all the opening brackets
                stack.push(c);
            }
            else if( c == ')' && !stack.isEmpty() && stack.peek() == '('){
            // if it is closing bracket check if peek elements is its correnpondance
                stack.pop();
            }
            else if ( c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if ( c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else{
                // for cases like (}})
                return false;
            }
        }
        return stack.isEmpty();

    }
}