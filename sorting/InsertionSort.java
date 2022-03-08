class InsertionSort {
    
    static int[] doInsertionSort(int[] array) {
    int length = array.length;
    
    // Start comparision for second element
    for(int i = 1; i< length; i++) {
        int key = array[i]; // second element
        int j = i -1; // use to track the previous element

        System.out.println("i =" + i + " : j : "+j);

        while ( j >=0 && array[j] > key) {
            array[j+1] = array[j];
        System.out.println("In> array[" + j +" + 1] >  " + array[j+1]);
            j--;
        }
        array[j+1] = key;

        System.out.println("out > array[" + j + "+ 1] >  " + array[j+1]);
    }

    return array;
}
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String arg[]) {
        int array[] = { 12, 11, 13, 5, 6 };
        int arr[] = doInsertionSort(array);
        
        printArray(arr);
    }
}
