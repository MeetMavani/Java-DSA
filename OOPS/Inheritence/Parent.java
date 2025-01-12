public class Parent {

    protected String ParentName;
    protected int ParentAge;

    public Parent(String naam){
        String navonaam = naam;
    } 

    public Parent(){
        this("Default Name");
    } 

    public String getter() {
        return ParentName;
    }

    public String setter(String name) {
        ParentName = name;
        return ParentName;
    }

    public String setter(String name, String name2) {
        ParentName = name;
        return ParentName;
    }

    public int setter(int age) {
        ParentAge = age;
        return ParentAge;
    }

    public static void main(String[] args) {
        // Parent p1 = new Parent("Meet");
        Parent p2 = new Parent();

        // System.out.println(p1.ParentName);
        System.out.println(p2.ParentName);

        // System.out.println(p1.setter(2));
    }
}