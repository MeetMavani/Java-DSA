// Remove characters except(other than) alphabets.

// SubString: We iterate through the string and check 
//           if the current char is in the range of a-z and A-Z, 
//           if yes we ignore the char if no we remove the char.
// TC : O(n*n) due to substring and concatenation and SC: O(n) due to new strings
// 
// StringBuilder: another optimal solution that combines the simplicity of using StringBuilder (to avoid 
//                the inefficiencies of repeatedly creating new String objects) and
//                the performance of a single-pass iteration.
// TC : O(n)  for a single pass through the string. SC: O(n) for storing the result in a StringBuilder.
//
// CharArray: -A char[] array is mutable, so we can overwrite elements in the array as we iterate through it.
//            -We use a two-pointer technique where one pointer (i) reads through the array, and 
//             another pointer (count) keeps track of the position where the next valid character should go. 
//            -This method effectively "shifts" alphabet characters to the front of the array, and
//             we return the length of the resulting string.
//            -Then finally we convert the valid portion of the array back to a string
//  TC: O(n) as each character is processed once. SC: O(1) in-place modifications minimizing additional space usage.



public class RemoveChExceptAlphabets {

    public static String Brute(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                continue;
            }

            // else if(ch >= 'a' && ch <= 'z') {
            //     continue;
            // }

            else {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            } 
        }
        
        return str;
    }

    public static String Better(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static int Optimal(char[] chr) {
        int count = 0;

        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == ' ') {
                chr[count] = chr[i];
                count++;
            }

            if (chr[i] >= 'a' && chr[i] <= 'z' || chr[i] >= 'A' && chr[i] <= 'Z') {
                chr[count] = chr[i];
                count++;
            }
        }
        return count; 
    } 


    public static void main(String[] args) {
        String str = "Lets12% *&go ^$#Kaifu";

        System.out.println("BruteForce: " + Brute(str));
        System.out.println("Better: " + Better(str));

        char[] chr = str.toCharArray();
        int newLength = Optimal(chr);
        String result = new String(chr, 0, newLength); 
        System.out.println(result);
    }
}
