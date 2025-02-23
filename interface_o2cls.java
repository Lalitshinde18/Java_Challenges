import java.util.*;

interface client {
    void input();
    void outout();


}
class Lalit implements client{


    String name ; 
    double sal;
   public void input(){
        Scanner r=new Scanner(System.in);
        System.out.println("Enter Username");
        name =r.nextLine();
        System.out.println("Enter Salary");
        sal =r.nextDouble();
    }

    public void output(){
        System.out.println(name+" "+sal);

    }

    
  
}

public class interface_o2cls {
    public static void main(String[] args) {
        client c=new Raju();
        c.input(); 
        c.outout();
    }
    
}
