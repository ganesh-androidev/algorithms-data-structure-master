class SumSubSetArrayKValue {


    static int findSubSetArray(int[] array, int sum, int length) {
        int subSetSum = 0;

        for (int i=0; i < length; i++) {
            subSetSum = array[i];

            for (int j= i +1 ; j < length; j++) {
                subSetSum = array[j] + subSetSum;

                if (subSetSum == sum) {
                    System.out.println("SumSubSetArray i = " + i + " && j =" + j);
                    return 0;
                }

                if (subSetSum >sum || j == length) break;
            }

        }

        System.out.println(" No Sub Set Array Found !");
        return 0;
    }

    public static void main(String str[]) {
       //  int[] array = {1,2,3,4,5};
        int array[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 23;
        int length = array.length;
        System.out.println("Expected O/P 1 and 4");
        findSubSetArray(array, sum, length);

    }
}
