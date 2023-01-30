/*
58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 
Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
 */

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // check bound and return 0 if is null or length is 0
        if(s == null || s.trim().length()==0){
            return 0;
        }
        // tirm method is a method to remove redundant space
        s = s.trim();
        // store the last index of string "the last word"
        String lastWord = s.substring(s.lastIndexOf(" ")+1);
        return lastWord.length();
    }
}
