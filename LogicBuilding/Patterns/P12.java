package LogicBuilding.Patterns;

public class P12 {
    public static void main(String[] args) {
        
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }

            for (int j = 2*(n - i)-2; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = i+1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
