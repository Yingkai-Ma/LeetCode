import java.util.Arrays;

/* 
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //If there is no common prefix, return an empty string "".
        if(strs.length==0){
            return "";
            //if strs just has 1 char then return it
        }else if(strs.length==1){
            //strs is array we need to give the index of it to return
            return strs[0];
        }
        
        //use the stringbuilder to mutable sequence of characters
        StringBuilder prefix = new StringBuilder();
        //sort the array eg. [moon, mom, matter] -> [mom, moon, matter] 
        // it helps to compare the array by string.length
        Arrays.sort(strs);

        //identiy the first and last char/string of the string
        String startStrs = strs[0];
        String endStrs = strs[strs.length-1];
        
        //loop the strs and append its result
        for(int i=0; i<startStrs.length()&&i<endStrs.length(); i++){
            // if it is equal then append it to the stringbulider
            if(startStrs.charAt(i) == endStrs.charAt(i)){
                prefix.append(startStrs.charAt(i));
                //if not then return the result
            }else{
                return prefix.toString();
            }
        }
        return prefix.toString();
    }
    
}
