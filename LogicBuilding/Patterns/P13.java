package LogicBuilding.Patterns;

public class P13 {
    public static void main(String[] args) {
        int n = 5;
        int print = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(print);
                print += 1;
            }
            System.out.println();
        }
    }
}


