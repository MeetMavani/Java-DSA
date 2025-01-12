package Constructor;

// import java.lang.reflect.Constructor;

public class CopyConstructor {

    int Age;
    String Name;

    CopyConstructor(int Age, String name) {
        this.Age = Age;
        this.Name = name;
        System.out.println(this.Age + "new " + this.Name);

    }

    CopyConstructor(CopyConstructor obj) {
        Age = obj.Age;
        Name = obj.Name;
        // System.out.println("This is copied vals" + Age + " " + Name);
    }

    public static void main(String[] args) {

        int paisa = 10;
        
        CopyConstructor C1 = new CopyConstructor(21, "Chintu");
        // CopyConstructor C2 = new CopyConstructor(C1);

        // System.out.println(C2.Age + " "  + C2.Name);
    }
}