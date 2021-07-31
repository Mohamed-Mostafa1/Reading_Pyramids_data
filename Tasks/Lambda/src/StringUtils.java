import java.util.function.BiPredicate;

public class StringUtils {
    public static String betterString(String s1, String s2, BiPredicate<String, String> b) {
        if(b.test(s1,s2)){
            return s1;
        }
        return s2;
    }

    public static boolean onlyAlphabet(String s){
        for(int i = 0; i < s.length(); i++){
            if(!Character.isLetter(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
