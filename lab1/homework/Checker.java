// Alexandru Amarghioalei
package lab1.homework;

import java.util.HashMap;
import java.util.Map;

public class Checker {
    /**
     *
     * @param s1 String 1 which must be compared.
     * @param s2 String 2 which must be compared.
     * @return True if S1 and S2 have at least one letter in common. False otherwise.
     */
    // Inspiration: JavaPoint
    public boolean commonLettersExist(String s1, String s2){
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), 1);
        }

        for(int i = 0; i < s2.length(); i++){
            if (map.get(s2.charAt(i)) == null){
                System.out.print("");
            }
            else if (map.get(s2.charAt(i)) > 0){
                return true;
            }
        }

        return false;
    }
}
