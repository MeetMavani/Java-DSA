public class Child extends Parent {
    
    String ChildName;
    int ChildAge;
    int roll = 10;
    
    public String cgetter() {
        return ChildName;
    }

    public String csetter(String name) {
        ChildName = name;
        return ChildName;
    }
    @Override
    public String getter() {
        System.out.println("This is Overiding" + ParentName);
        return ParentName;
    }

    public static void main(String[] args) {
        Child c1 = new Child();
        // c1.setter("Meet");
        Parent c2 = (Parent) c1;     
        System.out.println(c2.setter(2));
        // System.out.println(c1.roll);
        // System.out.println(c1.ParentName);
        // System.out.println(c1.ParentAge);
    }
}
