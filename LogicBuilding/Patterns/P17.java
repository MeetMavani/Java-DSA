package LogicBuilding.Patterns;

public class P17 {
    public static void main (String[] args) {

        int n = 4;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++) {
                if (i >= 1 && j >= i) {
                    System.out.print((char) ('A' +i+i-j));
                }
                else{
                    System.out.print((char) ('A' + j));
                }
            }
            System.out.println();
        }
    }
}

