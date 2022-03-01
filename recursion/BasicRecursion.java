class BasicRecursion {
    static int counter = 0;

    static String inception() {
        System.out.println("counter > "+ counter);
        if (counter > 5) return "done";
        
        counter ++;
        return inception();
    }

    public static void main(String arg[]) {

    System.out.println("inception out > "+inception());

    }
}
