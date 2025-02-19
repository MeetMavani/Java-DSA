package LogicBuilding.Patterns;

public class P9 {
    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 0; i <= 2*n-1; i++) {
            
            int stars = 2*i+1;
            int spaces = n-i;

            if (i>=n) {
                stars = ((2*(2*n - i))-1); 
                spaces = (i-n+1);
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
