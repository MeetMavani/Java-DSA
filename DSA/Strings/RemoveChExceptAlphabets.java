// Remove characters except(other than) alphabets.

// Approach: We iterate through the string and check 
//           if the current char is in the range of a-z and A-Z, 
//           if yes we ignore the char if no we remove the char.
// To remove char we use the same approach used before in remove spaces and remove vowels problem



public class RemoveChExceptAlphabets {
    public static void main(String[] args) {
        String str = "take12% *&u ^$#Kaifu";


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
        System.out.println(str);
    }
}
