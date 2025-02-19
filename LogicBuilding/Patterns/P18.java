package LogicBuilding.Patterns;

public class P18 {
    public static void main(String[] args) {
        
        int n = 5; // index of the initial letter (0 baseed)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + n - 1 - i + j));
            }
            System.out.println();
        }
    }
}
