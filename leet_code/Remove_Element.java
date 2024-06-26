/*
27. Remove Element
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages,
you must instead have the result be placed in the first part of the array nums. 
More formally, if there are k elements after removing the duplicates, 
then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
*/
/*
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
*/

//we can delete element of an array without making another array ;
import java.util.Arrays;
public class Remove_Element
{

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2}; // Input array 
        int val =2; // Value to remove
        int[] expectedNums = new int[]{0,1,4,0,3}; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;

        Arrays.sort(nums, 0,k); // Sort the first k elements of nums


        for (int i = 0; i < k; i++)
        {
    //System.out.println(nums[i]);
    //System.out.println(expectedNums[i]);
        assert nums[i] == expectedNums[i];
    
}

        
    }
    public static int removeElement(int[] nums, int val)
    {
       
       int count = 0;
       for (int i=0;i<nums.length;i++)
       {
           if(nums[i]!= val )
           {
               
               nums[count++]= nums[i];
               
           }
           
       }

        
        return count;
        
    }
}