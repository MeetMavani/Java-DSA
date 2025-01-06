// Brute: We Find the vowels using the same algorith created in countVCS.
//           Then we remove the vowel by merging the above two substrings.
//           substring(0, i): this will return the first half of string ending just before the vowel
//           substing(i+1): returns second half of string starting immediate after the vowel 
// TC : O(n*n) due to substring and concatenation and SC: O(n) due to new strings

// Better: We use StringBuilder class for string manipulation
//         Using the same conditions instead of removing vowels we take chars from the string except vowels
//         and append them in the stringbuilder then return the stringbuilder by converting it to string
// TC : O(n)  for a single pass through the string. SC: O(n) for storing the result in a StringBuilder.

// CharArray: -A char[] array is mutable, so we can overwrite elements in the array as we iterate through it.
//            -We use a two-pointer technique where one pointer (i) reads through the array, and 
//             another pointer (count) keeps track of the position where the next valid character should go. 
//            -This method effectively "shifts" non-vowel characters to the front of the array, and
//             we return the length of the resulting string.
//            -Then finally we convert the valid portion of the array back to a string
//  TC: O(n) as each character is processed once. SC: O(1) in-place modifications minimizing additional space usage.

public class RemoveVowels {

  public static String Brute(String str) {

    String vowels = "aeiouAEIOU";

    for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

    //   if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
        if (vowels.indexOf(ch) != -1) {
            str = str.substring(0, i) + str.substring(i + 1);
            i--;
        }
    }
    return str;
  }

  public static String Better(String str) {
    StringBuilder result = new StringBuilder();

    String vowels = "aeiouAEIOU";

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (vowels.indexOf(ch) == -1) {
        result.append(ch);
      }
    }
    return result.toString();
  }

  public static int Optimal(char[] str) {
    int count = 0;
    String vowels = "aeiouAEIOU";
  
    for (int i = 0; i < str.length; i++) {
        if (vowels.indexOf(str[i]) == -1) {
            str[count] = str[i];
            count++;
        }
    }
    return count; // Length of the valid portion
  }

  public static void main(String[] args) {
    String str = "Meet Mavani";
    System.out.println("String after removing the vowels \n" + Brute(str));
    System.out.println("String after removing the vowels \n" + Better(str));

    char[] charr = str.toCharArray();
    int newlength = Optimal(charr);

    String result = new String(charr, 0, newlength);
    System.out.println(result);

  }
}

