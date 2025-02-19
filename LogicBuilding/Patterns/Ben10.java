//         ^    ^
//        * **** *     *  
//       *  .  .  *^     * 
//       *   ><   *     **
//        ********)    **
//     ***  ***    }***
//            ****  ****  
//          
 
package LogicBuilding.Patterns;

public class Ben10 {
    public static void main(String[] args) {
        
        int n = 5;
        for (int i = 0; i < n*2-1; i++) {
            int stars = i+1;
            int spaces = 2*(n-i-1)+1;
            int secondaryStars = i+1; 

            if (i>=n) {
                stars = n*2-1-i;
            }
            for (int j = 0; j < stars; j++) {       
                System.out.print("*");
            }

            if (i >= n) {
                spaces = ((i+1)-(((2*n)-i)-2));
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            if (i>=n) {
                secondaryStars = (i+1 - (((i-n)*2)+2));
            }
            for (int j = 0; j < secondaryStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

