// 
class SelectionSort {

    static int[] doSelectionSort(int[] array) {
        int length = array.length;
        
        for(int i=0 ; i< length; i++) {
            for (int j = i+1; j< length; j++) {
                int minIndex = i;
                if (array[j] < array[i]) {
                    minIndex = j;
                 }

                 int temp = array[minIndex];
                 array[minIndex] = array[i];
                 array[i] = temp;
                }
            }
        return array;
    }

    // Prints the array
    static void printArray(int arr[])
    {
        arr = doSelectionSort(arr);
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String arg[]) {
        int array[] = {64,25,12,22,11};
        printArray(array);
    }
}
