class FindMaxMinValueInArray {


    public static void main(String arg[]) {
        int array[] = {50,10,30,90,30,20,5};
        
        int MAX = array[0];
        int MIN = array[0];

        for (int i= 1; i < array.length; i++) {
            
            if (array[i] > MAX) {
                MAX = array[i];
            }
            
            if (array[i] < MIN) {
                MIN = array[i];
            }
        }
        System.out.println(" MAX Number is : " + MAX);
        System.out.println(" MIN Number is : " + MIN);
    }
}
