import java.util.HashSet;

class FindDuplicateNumber {



    public static void main(String arg[]) {
        int[] array1 = {10,20,30,40,50,60,70,80};
        int[] array2 = {1,20,3,40,5,60,7,80};
        System.out.println("Expected : ");
        HashSet<Integer> map = new HashSet<Integer>();

        for (int element : array1) {
            map.add(element);
        }
        
        for (int element : array2) {
           boolean isDuplicate =  map.contains(element);
           if(isDuplicate) {
                System.out.println(element);
           }
        }
    }
}
