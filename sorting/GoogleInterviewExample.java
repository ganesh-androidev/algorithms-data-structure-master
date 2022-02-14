class GoogleInterviewExample {
/// Collection of number, find a matching pair and equal to given sum number
// Example 
// [1,2,3,9] Sum 8
// [1,2,4,4,] Sum = 8

    private static boolean findMatchingPair(int[] array,int sum) {
        int[] storeArray = new int[array.length];
        int k = 0;

        for (int i=0; i < array.length;i++) {
            for (int j=0; j< array.length; j++) {
                int sumChecker = array[i] + array[j];
                if (sumChecker == sum) {
                    System.out.println(" Pair is [" + array[i] + "," + array[j] + "]" + " & Sum is :" + sum);
                    k++;
                }
            }
        }
        
        if (k > 0) {
            System.out.println(k + " Valid Pair Found");
            return true;
        }

        System.out.println("Sorry - No Valid Pair Found");
        return false;
    }

    private static boolean hasPairWithSum(int[] array, int sum) {
        int low =0;
        int high = array.length - 1;
        int k =0;
        System.out.println("***** Second Approch with Better Big O(n) ****");

        while (low < high) {
            
            int result = array[low] + array[high];

            if ( result == sum) {
                System.out.println(" Pair is [" + array[low] + "," + array[high] + "]" + " & Sum is :" + sum);
                k++;
            }

            low++;
        }
        if (k > 0) {
            System.out.println(k + " Valid Pair Found");
            return true;
        }
        
        System.out.println("Sorry - No Valid Pair Found");
        return false;
    }

    public static void main(String[] arg) {
        int[] array = {1,2,3,4,6}; 
        int length = array.length;
        int sumExpected = 8;
        findMatchingPair(array, sumExpected);
        hasPairWithSum(array, sumExpected);
    }
}
