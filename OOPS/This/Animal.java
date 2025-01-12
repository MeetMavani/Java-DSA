package This;

public class Animal {
    void sound(){
        System.out.println("All animals shout");
    }
}

class dog extends Animal {
    void sound (){
        super.sound();
        System.out.println("Bhauu Bhauu");
    }
}