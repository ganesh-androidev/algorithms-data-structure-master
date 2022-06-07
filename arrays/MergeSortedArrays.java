// Merge Sorted Arrays 
// Input : ([0, 3, 4, 31], [4, 6, 30])
// Expected Result : [0, 3, 4, 5, 6, 30, 31 ]
import java.util.Arrays;

class MergeSortedArrays {

    static void mergeArrays(int[][] array) {
    int array1Length = array[0].length;
    int array2Length = array[1].length;
    int targetLength = array1Length + array2Length;
    int[] mergedArray = new int[targetLength];
    System.out.println(" array1Length > " + array1Length  + " >> array2Length >> " +array2Length);
    int k =0;

    // Add Error Check
    if (array1Length == 0 ) {
         System.out.println(Arrays.toString(array[1]));
         return;
    }

    if (array2Length == 0 ) {
         System.out.println(Arrays.toString(array[0]));
         return;
    }

    for (int i=0;i < array1Length; i++) {
         mergedArray[k] = array[0][i];
         k++;
    }

    for (int i=0;i < array2Length; i++) {
         mergedArray[k] = array[1][i];
         k++;
    }

   // Arrays.sort(mergedArray); 

   // Sort an array wioth single loop
    int temp =0;
    for (int j=0; j< mergedArray.length -1; j++) {
        
        if (mergedArray[j] > mergedArray[j+1]) {
            temp = mergedArray[j];
            mergedArray[j] = mergedArray[j+1];
            mergedArray[j+1] = temp;
            j = 0;
        }
    }


    System.out.println(Arrays.toString(mergedArray));
}
    public static void main(String[] arg) {
        int[][] input2dArray = {{0, 3, 4, 31}, {1,5,31,55}};
        mergeArrays(input2dArray);
    }
}
