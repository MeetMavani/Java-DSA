// Approach: We use the same algorithm created in the problem RemoveVowels and just change the conditon 
//           for detecting the whitespaces.


public class RemoveSpaces {
    
    public static void main(String[] args) {
        
        String str = "D  I S H A";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        System.out.println(str);
    }
}
