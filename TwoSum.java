/* 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

xample 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 
Constraints:
2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.
 
Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */



class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //get nest loop to find nums 
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                //find the second num that sum to target
                int secondNum = target - nums[i];
                //if find the sec num then add into a new array and return
                if(nums[j]==secondNum){
                    return new int[]{i,j};
                }
            }
        }
        //if not then throw exception
        throw new IllegalArgumentException("Not found.");
    }
}

//second way has less time complexity
/*
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int secondNum = target - nums[i];
            if(num_map.containsKey(secondNum)){
                return new int[]{num_map.get(secondNum),i};
            }
            num_map.put(nums[i],i);
        }
        //if not then throw exception
        throw new IllegalArgumentException("Not found.");
    }
}
 */
