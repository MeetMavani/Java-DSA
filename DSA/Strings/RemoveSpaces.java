// SubString: We use the same algorithm created in the problem RemoveVowels and just change the conditon 
//            for detecting the whitespaces.
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
//            -This method effectively "shifts" non-space characters to the front of the array, and
//             we return the length of the resulting string.
//            -Then finally we convert the valid portion of the array back to a string
//  TC: O(n) as each character is processed once. SC: O(1) in-place modifications minimizing additional space usage.

public class RemoveSpaces {

    public static void substring(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        System.out.println(str);
    }

    public static void stringbuilder(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(str);
    }

    static int chararray (char[] str) {
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                str[count] = str[i];
                count++;
            }
        }
        return count; // Length of the valid portion
    }

    
    public static void main(String[] args) {
        
        // String str = "D  I S H A";
        // substring(str);

        char[] str = "Kaifu Cl an ".toCharArray();
        int newLength = chararray(str);
        
        // Convert the valid portion of the array back to a string
        String result = new String(str, 0, newLength);
        System.out.println(result); // Outputs: "Takeyouforward"
        
    }
}
