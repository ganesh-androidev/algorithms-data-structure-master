import java.util.HashSet;
import java.util.Set;
class FindLoggestSubString {


    private static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int len = s.length();
        
        Set <Character> set = new HashSet<>();
    
        for(int i=0;i<len;++i) {
            set.clear();
            for(int j=i;j<len;++j) {
                char c = s.charAt(j);
                if (set.contains(c))
                    break;
                System.out.print(" Each Char " + c);
                set.add(c);
                res = Math.max(res, set.size());
                System.out.println(" res  " + res);
           }
        }
        System.out.println("result : " + res);
        return res;
    }

    public static void main(String str[]) {
        String input = "abcadcbb";
        lengthOfLongestSubstring(input);

    }
}
