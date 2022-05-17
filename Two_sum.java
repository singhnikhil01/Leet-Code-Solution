/* 
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
*/
import java.util.Arrays;
public class Two_sum 
{
    public static void main(String[] args) 
    {   
        //Arrays arr = new Arrays();
        int [] array ={3,2,4}; 
        int target = 6; 
        System.out.print(Arrays.toString(twoSum(array, target)));
    }

    public static int[] twoSum(int [] nums , int target)
    {
        
        int sum =0;
        int []list =new int[2];
        for(int i=0;i < nums.length;i++)
        {
            for(int j=0;j< nums.length;j++)
            {
                System.out.println(nums[i]+"+"+nums[j]);
                if((nums[i]+nums[j] == target) && (sum==0) )
                {
                    System.out.println(nums[i]+nums[j]);
                    if (nums[i] == nums[j] && (i !=j))
                    {
                        list[0]=j;
                        list[1]=i;
                        sum++;
                    }  
                    else if ((i !=j))
                    {
                        list[0]=i;
                        list[1]=j;
                        sum++;

                    }
                }
            }
        }
        
        Arrays.sort(list);
        return list;
    }
    

}
