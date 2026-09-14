package arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }

        Map<Character, Integer> list = new HashMap<>();

        for(char i:s.toCharArray()){
            list.put(i, list.getOrDefault(i, 0)+1);
        }

        for(char i: t.toCharArray()){
            list.put(i, list.getOrDefault(i, 0)-1);
        }

        for(char i: list.keySet()){
            if(list.get(i)>0 || list.get(i)<0){
                return false;
            }
        }

        return true;
    }
}
