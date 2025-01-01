// So firstly, Vowels = a e i o u, Consonants = non-vowels and 
// whitespaces = spaces between words or letters if present

// Approach: Initially we convert the given string to lowercase for uniformity while counting the vcw's.
//           Now to find the:  
//           1. Vowels: We create an string of vowels and use indexof method which checks 
//                      whether the specified char/substring is present in the sting or not. 
//                      If string contains an vowel it returns its index which would be not equal to -1
//                      and conditions becomes true and vowels count gets incremented.
//                      If current char is not an vowel indexof returns -1 which doesn't pass the conditon.
//                      Hence vowel counter doesn't increment.
//                      Another way can be to use basic if condition mentioned in below code(Commented)
//           2. WhiteSpaces: We use simple if condition to check and update counter accordingly
//           3. Consonants: If neither vowels nor whitespace we update consonant counter.
//                          This part is little tricky as it could go wrongways if string contains  
//                          characters other than these three so there is one more way which is to 
//                          specify range i.e a-z if curent char is between them we can consider it.
//                          This method is also mentioned in below code(Commented)              

import java.util.Scanner;

public class CountVCS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        int vowels = 0, consonants = 0, whitespaces = 0;
        inputStr = inputStr.toLowerCase();

        String vowelList = "aeiou";

        // Another way to traverse the string is:
        // for (char ch : str.toCharArray())
        // it will convert the string into char array and run an loop for each char

        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);

            if (vowelList.indexOf(ch) != -1) {
                vowels++;
            }
            else if(ch == ' ') {
                whitespaces++;
            } else {
                consonants++;
            }
        }
        sc.close();

        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //     vowels++;
        // }
        // else if(ch >= 'a' && ch <= 'z') {
        //     consonants++;
        // }    
        // else if (ch == ' '){
        //     whitespaces++;
        // }    

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Whitespaces: " + whitespaces);
    }
}


// Started solving questions on strings and the first one being count the number of vowels, consonants and whitespaces in an string.