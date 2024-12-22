##Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

##You may assume that each input would have exactly one solution, and you may not use the same element twice.

##You can return the answer in any order.

##Example 1:

##Input: nums = [2,7,11,15], target = 9
## Output: [0,1]
##Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
##Example 2:

##Input: nums = [3,2,4], target = 6
##Output: [1,2]
##Example 3:

##Input: nums = [3,3], target = 6
##Output: [0,1]

#Solution

#Time complexity O(n), space complexity O(n)

public int[] twoSum(int[] nums, int target) {

       Map <Integer, Integer> numbers = new HashMap<>();

       for(int i=0; i<nums.length; i++){
        int temp = nums[i];
        int temp2 = target - temp;
        if(numbers.containsKey(temp2)){
            return new int[]{numbers.get(temp2),i};
        }
        numbers.put(nums[i], i);
       }
        return new int []{0,1};
       
    }

#Time complexity O(n^2) and space complexity O(1)
  
public int[] twoSum(int[] nums, int target) {

 for(int i=0; i<nums.length; i++){
         int temp= nums[i];

         for(int j =i+1; j<nums.length; j++){
               int tempSum = temp + nums[j];
                 if(tempSum == target){
                     return new int[]{i,j};
                }else{
                     continue;
                 }
            }
         }
         return new int[]{0,1};
}
  

