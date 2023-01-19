/*
 * 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 
Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        // check all input string if they have a pair or not if not return false
        if(s.length()%2 !=0){
            return false;
        }
        // use stack to store and check inputs
        Stack<Character> stack = new Stack<>();
        // for each loop to store string into char array
        for(char c: s.toCharArray()){
            // push all opening braces to stack & compare them with closed ones later
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            // if top element in stack is ( and given element is ) then remove that pair. 
            }else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }else{
                // when cases like }}, )), ([}}]) this will return false
                return false;
            }
        }
        // when every pair is removed then stack becomes empty & it is true. else false
        return stack.isEmpty();
        
    }
}
