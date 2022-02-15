/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
*/
import java.util.Arrays;

class MoveZeroToArrayEnd {

    private static void moveZeros(int[] array) {
        int length = array.length;
        int counter = 0;
        
        for (int i=0;i< length; i++) {
            if (array[i] != 0)  {
                array[counter] = array[i];
                counter++;
            }
        }

        while (counter < length) {
            array[counter++] = 0;
        }

        System.out.println( "Output :" + Arrays.toString(array));
    }

    public static void main(String[] args) {
    int[] inputArray = {0,10,0,3,0,12};
    System.out.println("Input : " + Arrays.toString(inputArray));
    moveZeros(inputArray);

    }
}
