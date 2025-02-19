package LogicBuilding.Patterns;

public class P11 {
    public static void main(String[] args) {
        
        int n = 5;
        int print = 0;

        for (int i = 0; i < n; i++) {

            if (i%2 == 0) {
                print = 1;
            }
            else {
                print = 0;
            }

            for (int j = 0; j < i+1; j++) {
                System.out.print(print);
                print = 1 - print;
            }
            System.out.println();
        }
    }
}



// if (i%2== 0 && j%2 == 0) {
//     System.out.print("1");
// }
// else if(i%2 == 0 && j%2 == 1) {
//     System.out.print("0");
// }
// else if (i%2 == 1 && j%2 == 0) {
//     System.out.print("0");
// }
// else if(i%2 == 1 && j%2 == 1) {
//     System.out.print("1");
// }