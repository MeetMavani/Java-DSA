// BruteForce: step 1: We Split the string at every space. This gives us an string array where each index 
//                     value represents an word from the given string
//             step 2: We traverse through each word and for each word we create three substrings
//                     - firstletter, it extracts the first letter of the word and converts it to uppercase
//                     - lastletter, it extracts the last letter of the word and converts it to uppercase
//                     - middle, it extracts the the chars of the word other than first and last letter
//             step 3: We create another resultant string which concates all the above substrings.
//             Step 4: At end of loopwe return the result string which would be storng all the words with 
//                     its first and last letters capitalized.
// TC: O(n*n) and SC: O(n)

// Better: We do the same process we did in above Brute force approach but instead of using result string
//         we use stringbuilder for concatenation instead of result += ...
//         This reduces the time complexity to O(n) by avoiding repeated string object creation.
// TC: O(n) and SC: O(n)

// Optimal: Step 1: Convert the string to a char[] to allow in-place modification.
//          Step 2: int start points to the beginning of the current word.
//                  i traverses the string to identify word boundaries (spaces or the end of the string)
//          Step 3: For each word: 
//                      The first character (chars[start]) is capitalized.
//                      The last character (chars[i-1]) is capitalized.
//          Step 4: The modified char[] is converted back to a String to return the result.
// TC: O(n) and SC: O(1)

public class CapitalizeFirstAndLastLetter {
    
    public static String BruteForce(String str) {

        String[] strar = str.split(" ");

        String result = "";
        for (int i = 0; i < strar.length; i++) {

            String firstLetter = strar[i].substring(0, 1).toUpperCase();
            String lastLetter = strar[i].substring(strar[i].length()-1).toUpperCase();
            String middle = strar[i].substring(1, strar[i].length()-1);

            result += " " + firstLetter + 
            middle + 
            lastLetter;
            
        }

        return result.trim();
    }


    public static String Better(String str) {
        String[] strar = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strar.length; i++) {
            String firstLetter = strar[i].substring(0, 1).toUpperCase();
            String lastLetter = strar[i].substring(strar[i].length()-1).toUpperCase();
            String middle = strar[i].substring(1, strar[i].length()-1);

            sb.append(firstLetter).append(middle).append(lastLetter).append(" ");
            
        }

        return sb.toString().trim();
    }

    public static String Optimal(char[] chars) {
        int n = chars.length;
        int start = 0;

        for (int i = 0; i <= n; i++) {
            if(i == n || chars[i] == ' ') {

                if(i > start) {
                    chars[start] = Character.toUpperCase(chars[start]);
                    
                    if (i - 1 > start) {
                        chars[i - 1] = Character.toUpperCase(chars[i - 1]);
                    }
                }
                start = i + 1;
            }
        }
        return new String(chars);
    }
    
    public static void main(String[] args) {
        
        String str = " kaifu  clan ";
        System.out.println(BruteForce(str));
        System.out.println(Better(str));

        char[] chars = str.toCharArray();
        System.out.println(Optimal(chars));



    }
}


