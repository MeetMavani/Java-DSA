// Approach: We Find the vowels using the same algorith created in countVCS.
//           Then we remove the vowel by merging the above two substrings.
//           substring(0, i): this will return the first half of string ending just before the vowel
//           substing(i+1): returns second half of string starting immediate after the vowel 

public class RemoveVowels {

  public static String removevowel(String str) {

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

  public static void main(String[] args) {
    String str = "Meet Mavani";
    System.out.println("String after removing the vowels \n"+removevowel(str));
  }
}

