import java.util.Arrays;

class RemoveEmptySpace {

    static void doRemoveEmptySpace(String input) {
        System.out.println(input.contains(" "));
        char[] charIn = new char[input.length()];
        int i = 0;

        while( i < input.length()) {
            charIn[i] = input.charAt(i);
            if(charIn[i] == ' ') {
                System.out.println("Empty Space Found " + i);
                charIn[i] = '-';
            }
            i++;
        }
        System.out.println("Output : " + Arrays.toString(charIn));
        System.out.println("Output : " + new String(charIn));
        
    }

    public static void main(String arg[]) {
        String input = "Hi My Name is Ram";
        String result = input.replace(" ", "%20");
        System.out.println(result);
        doRemoveEmptySpace(input);
        
    }
}
