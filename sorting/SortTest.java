import java.util.Arrays;

class SortTest {

    public static void main(String arg[]) {
        int[] array = {12,34,1,33,4,41,3,4,0};
        Arrays.sort(array);
        for (int i=0;i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
