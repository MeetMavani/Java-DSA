public class IndexOfFirstOccurenceInStr {

    public static int index(String str, String subStr){
        
        // Return -1 if the string or substring is null or if the substring is longer than the string
        if (str == null || subStr == null || str.length() < subStr.length()) {
            return -1; 
        }
        int ind;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != subStr.charAt(0)) {
                continue; // Skip to the next iteration if the first character doesn't match
            } else {
                ind = i;
                for (int j = 0; j < subStr.length(); j++) {
                    if (str.charAt(i) == subStr.charAt(j)) {
                        if (j == subStr.length() - 1) {
                            return ind; // Return the index if the entire substring matches
                        }
                        i++; // Move to the next character in the main string
                    } else {
                        break; // Break if characters do not match
                        
                    }
                }
            }
           
        }

        return -1;
    }

    public static void main(String[] args) {
        
        String str = "MeetMavani";
        String subStr = "tM"; 

        System.out.println("Index of first occurrence: " + index(str, subStr));
    }
}