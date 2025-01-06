// Calculate the sum of numbers present in the string (multiple consecutive digits are considered one number)

//  Approach: - The program iterates through each character in the string str
//            - It checks if the character is a digit (between '1' and '9')
//               - If it is a digit, it appends the character to a temporary string s (which initially starts as "0").
//               - If it encounters a non-digit character, it converts the current string s 
//                (which represents a number) into an integer, adds it to the sum, and then resets s to "0".
//            - After iterating through the string, any remaining number (if the string ends with digits)
//              is added to the sum.
// TC: O(n) The program processes each character exactly once. 
// SC: O(1) because the program uses a constant amount of extra space (the sum and s variables).



public class SumOfNumberInString {

    public static int myapp(String str){
        int sum = 0;

        String s = "0";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= '1' && ch <= '9') {
                s += ch;

            } else {
                sum += Integer.parseInt(s);
                s = "0";
            }

            
        }
        
        return sum += Integer.parseInt(s);
    }
    public static void main(String[] args) {
        String str = "5xy33z23xy1";
        System.out.println(myapp(str));
    }
}
