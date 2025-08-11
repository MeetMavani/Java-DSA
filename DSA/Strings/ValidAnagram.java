import java.util.*;

public class ValidAnagram {
    
    public static boolean optimal(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']--;
            arr[t.charAt(i) - 'a']++;
        }
        for (int count : arr) {
            if(count != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean hashmap(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map  = new HashMap<>();

        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c: t.toCharArray()) {
            if(map.getOrDefault(c,0) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaaram";

        System.out.println("Using array method: " + optimal(s, t)); // true
        System.out.println("Using hashmap method: " + hashmap(s, t)); 
    }
}
