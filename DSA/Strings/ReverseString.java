// Approach: We use the two pointer approach for swaping the first-last chars then second-secondlast and so on.
//           We use String Builder for modifying the string which helps eliminating the use of extra space
//           like another string(concatenation), stack, char array.
//           TC O(n) and SC O(1)


public class ReverseString {
    public static void main(String[] args) {
        
        
        String str = "Kaifu Clan";
        StringBuilder sb = new StringBuilder(str);

        int n = str.length();

        int i = 0;
        int j = n-1;


        while(i < j) {
    
            sb.setCharAt(i, str.charAt(j));
            sb.setCharAt(j, str.charAt(i));
            
            i++;
            j--;
        } 
        System.out.println(sb);   

    }
}
