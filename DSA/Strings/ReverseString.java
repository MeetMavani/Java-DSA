// BruteForce: Stack(EXTRA SPACE)

// Algo: We use the two pointer approach for swaping the first-last chars then second-secondlast and so on.

// StringBuilder(Better): We use String Builder for modifying the string. This still takes extra space.
//                        TC: O(n) and SC O(n)
//When you initialize StringBuilder, it internally holds a new buffer to store the string. 
//This buffer is allocated as extra space, which is not part of the original input string.

// Char Array(Optimal): We which helps eliminating the use of extra space like another string(concatenation), 
//                      stack, char array.
//                       TC O(n) and SC O(1)
//When you use a char[] array, you're working directly with the characters from the input string and modifying them in place.
//The char[] array is not "extra" in the sense of creating a separate new copy of the data (like StringBuilder does). 
//It’s just a mutable container that allows changes without needing a new copy of the string.

// Built-in: str.reverse()
public class ReverseString {


    public static String Better(String str) {

        StringBuilder sb = new StringBuilder(str);

        int n = str.length();
        int i = 0;
        int j = n-1;


        while(i < j) {
            sb.setCharAt(i, str.charAt(j));
            sb.setCharAt(j, str.charAt(i));
            i++;
            j--;
        } 

        return sb.toString();
    }

    public static String Optimal(char[] str) {

        int i = 0;
        int j = str.length - 1;
        
        while(i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }


        return new String(str);
    }

    public static void main(String[] args) {
        
        String str = "Kaifu Clan";
        System.out.println("Better: " + Better(str));
    }
}
