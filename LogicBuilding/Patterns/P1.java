/*
First of all in such patterns questions we use two nested for loops(i & j)
i for columns and j for rows plus an sout at end of i loop for moving to next row

ex: n = 5

      j=0       j=1     j=2     j=3     j=4
i=0   sout(*)   sout(*) sout(*) sout(*) sout(*)
sout() for moving to next line

similarly as i iterates it creates n number of rows and j prints n number of stars
and after j loop ends we move to next row where this process repeats till i reaches n
*/

// output:
//         *****
//         *****
//         *****
//         *****
//         *****



// Approach 


package LogicBuilding.Patterns;

public class P1 {
    public static void main(String[] args) {
        
        int n = 5;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
