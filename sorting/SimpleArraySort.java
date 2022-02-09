class SimpleArraySort {

    static int[] doArraySorting(int nums[]) {
       int array[] = nums;
       int length = array.length;
       int temp = 0;

	System.out.println("Input Array :");

	for (int k=0; k< length;k++) {
	    System.out.print("[" + array[k] + "]");
        }
	
        for (int i=0; i<length; i++) {
            for (int j=i+1; j<length;j++) {
	        if (array[i] > array[j]) {
	            temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }  
            }   
        }

	System.out.println("\n Output Sorted Array :");
	for (int k=0; k< length;k++) {
	    System.out.print("[" + array[k] + "]");
        }	
        return array;
    }
 
    public static void main(String arg[]) {
        int array[] = {5,7,4,1,5,7,4};
        array = doArraySorting(array);
    } 
}
