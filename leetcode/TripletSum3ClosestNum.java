/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.
*/

class TripletSum3ClosestNum {
    
    static int findTripletSumResult(int[] array, int x) {
        // To store closest sum 
        int closestSum = Integer.MAX_VALUE;
        int currentSum =0;
        int length = array.length;
    
        for (int i=0; i< length; i++) {
    
            for (int j = i+1; j< length; j++) {
            
                for (int k= j+1; k< length; k++) {

                    currentSum = array[i] + array[j] + array[k];
                    if ( Math.abs(x - closestSum) > 
                         Math.abs(x - currentSum)) {
                        closestSum = currentSum;
                     }
                }
            }
         }
         System.out.println(" ** Result Closest Triplet Sum of Number is "+ closestSum);
         return closestSum;
    }

    public static void main(String arg[]) {
        int array[] = { -1, 2, 1, -4};
        int x = 1;

        findTripletSumResult( array,x);

    }
}
