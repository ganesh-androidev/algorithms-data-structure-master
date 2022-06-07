class CountKPairArray {

    private static int[] doArraySorting(int[] array, int length) {
        int temp = 0;
        for(int i=0; i<length;i++) {
            for (int j = i+1; j< length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }

            }

        }

        for (int k=0; k < length; k++) {
            System.out.println(array[k]);
        }
        return array;
    }

    private static int pairKValueDistArray(int[] array, int length) {
        int k = 3;
        int count = 0;
        //  1,2,3,5,7,9,12
        for (int i=0; i< length; i++) {
            for(int j = i+1; j<length; j++) {
                if (array[j] - array[i] == k) {
                    System.out.println("{" + array[i] + "," + array[j] + "}");
                    count++;
                }

            }
        }
        System.out.println("count :" + count);
        return count;
    }
    public static void main(String[] str) {
        int[] array = {1,15,10,7,5,9,2,12,3};
        int[] sortedArray = doArraySorting(array, array.length);
        pairKValueDistArray(sortedArray, sortedArray.length);
    }
}
