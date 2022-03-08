// Take a array and bubble up with higher number and sort it
class BubbleSort {
    static int[] doBubbleSort(int array[]) {
        int length = array.length;
        int temp = 0;

        for (int i=0; i< length; i++) {
            for (int j = i +1; j < length ; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
       
       for (int k=0; k< length; k++) {
            System.out.print(" [" + array[k] + "]" );
       }
        return array;
    }

    public static void main(String arg[]) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        doBubbleSort(numbers);
   }

}

// Time Complexity Big O(n2)
// Space Complexity O(1) 
