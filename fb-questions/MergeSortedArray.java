import java.util.*;

class MergeSortedArray {

    private static int[] doSortedArray(int[] array1, int[] array2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int element : array1) {
            arrayList.add(element);
        }

        for (int element: array2) {
            if (!arrayList.contains(element)) {
                arrayList.add(element);
            }
        }
        
        Collections.sort(arrayList);

        for (int element : arrayList) {
            System.out.println(element);
        }
        return array1;
    }

    public static void main(String arg[]) {
        int[] array1 = {3,7,1,2,4,5};
        int[] array2 = {8,2,3,4,6};
        
        doSortedArray(array1, array2);
    }
}
