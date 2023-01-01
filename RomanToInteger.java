import java.util.HashMap;

/* 
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 
Constraints:
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */

public class RomanToInteger{
    public int romanToInt(String s){
        //use hashmap to set the values char as the key and int as the value
        HashMap <Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // an empty int value to store the value
        int newInt = 0;

        //use loop to cal the roman number and convet to int
        for(int i=0; i<s.length();i++){
            //Three factors can lead to changes in results
            if(s.charAt(i)=='V' || s.charAt(i)=='X'){
                // i>0 make sure it is not out of bound and check position before i if that is a 'I'  
                if(i>0 && s.charAt(i-1)=='I'){
                    // "IV" = 4  However if not -2 it will be 1 + 5 = 6 
                    newInt = newInt - 2; 
                    
                }
            }
            if(s.charAt(i)=='L' || s.charAt(i)=='C'){
                if(i>0 && s.charAt(i-1)=='X'){
                    newInt = newInt - 20; 
                    
                }
            }
            if(s.charAt(i)=='D' || s.charAt(i)=='M'){
                if(i>0 && s.charAt(i-1)=='C'){
                    newInt = newInt - 200; 
               
                }
            }
        newInt = newInt + map.get(s.charAt(i));
        }
    return newInt;

    }
}