package This;

public class Test {

    int x, y;

    Test() {
        this(6); // calls constructor with parameter
    }
    
    Test(int x) {
        this.x = x; // 'this' is used to access the instance variable
    }

    Test(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void display(Test obj) {
        System.out.println("x = " + obj.x + ", y = " + obj.y);
    }
    void displayUsingThis() {
        display(this); // passing 'this' as an argument
    }


    public static void main(String[] args) {
     Test t1 = new Test(2, 1);

    }
}
