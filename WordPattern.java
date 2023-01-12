import java.util.HashMap;


/* 
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 
Constraints:
1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
 */

public class WordPattern {

    //test via a main method

    public boolean wordPattern(String pattern, String s) {
        // put s into array newStringS by split it between " "
        // "dog cat dog cat"  => [dog, cat, dog, cat]
        String[] newStringS = s.split(" ");
        // check the length if not match then return false
        // "abba","dog cat cat dog dog"  => 4!=5 return false
        if(pattern.length()!=newStringS.length){
            return false;
        }
        // create a hashmap assign pattern as the key and s as the value
        HashMap<Character, String> map = new HashMap();
        // loop the pattern and assign key and value
        for(int i=0; i<pattern.length();i++){
            // assign key into char
            char currentChar = pattern.charAt(i);
            // check the map if the value that match the key 
            // {a: dog}, {a: dog}  return true 
            // {a: dog}, {a: cat}  return false    
            if(map.containsKey(currentChar)){
                // check key and value if not match then return false
                if(!map.get(currentChar).equals(newStringS[i])){
                    return false;
                }
            }else{
                if(map.containsValue(newStringS[i])){
                    return false;
                }
                map.put(currentChar, newStringS[i]);
            }
        }
        return true;
    }   
}
