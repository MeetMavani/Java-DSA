package LogicBuilding.Patterns;

public class P10 {
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 0; i < 2*n-1; i++) {
            int stars = i+1;

            if (i>=n) {
                stars = (2*n-1) - (i+1);    
            }

            for(int j = 0; j < stars; j++) {

                System.out.print("*");

            }
            if (i == 8) {
                break;
            }
            System.out.println();
        }
    }
}
