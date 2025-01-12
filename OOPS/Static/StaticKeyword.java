package Static;

public class StaticKeyword {
    
    static String CompanyName = "Rachain";

    String EmpName;
    int EmpId;


    static void display() {
        CompanyName = "Rachint";
        System.out.println(CompanyName);
    }
    static{System.out.println("static block is invoked");}  
    
    public static void main(String[] args) {
        StaticKeyword s1 = new StaticKeyword();
        System.out.println(s1.CompanyName = "dada");
        
        StaticKeyword s2 = new StaticKeyword();
        System.out.println(s2.CompanyName);
        
        s1.display();
    }
}
