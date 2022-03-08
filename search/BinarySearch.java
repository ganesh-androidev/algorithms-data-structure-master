class BinarySearch {


    public static void main(String arg[]) {
        int[] array = {10,20,30,40,50,60,70,80,90,100,110};
        int find = 30;
        boolean loop = true;
        int start = 0;
        int end = array.length - 1;

        while(loop) {
            int middle = (start + end) / 2;
            
             System.out.println("Middle Index  " + middle);
            if (array[middle] == find) {
                System.out.println(" The number which you where seaeching for " + array[middle]);
                loop = false;
            }
            
            if (array[middle] < find) {
                // Move Start point 
                start = middle + 1;
            }

            if (array[middle] > find) {
                // Move End point 
                 end = middle - 1;
            }
        }
    }
}
