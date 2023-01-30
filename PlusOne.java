/*
 66. Plus One

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 
Constraints:
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
        // Two cases need to be considered: 
        // 1. the last index int is less than 9
        //      1.1 if the last number is 9 but the first number is <9 than add the carry to front and add up
        // 2. that all index int is 9
        // Step 1: loop the array from back to front and the check the last index
        int length = digits.length;
        for(int i = length-1; i >= 0; i-- ){
            // case 1: assume last number is less than 9
            if(digits[i]<9){
                // add up and return the number and print the array
                digits[i]++;
                return digits;
            }
            // if the last number is 9 we set the last number to 0 [1,2,9] =>[1,3,0]
            digits[i]=0;
        }
        // case 2: that all index int is 9
        // create a new array set the first index to 1 and else to 0
        int[] case2 = new int[length+1];
        case2[0]=1;
        return case2;
        
    }
}
