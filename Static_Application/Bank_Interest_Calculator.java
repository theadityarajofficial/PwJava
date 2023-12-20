import java.util.*;
public class Bank_Interest_Calculator {
    public static void main(String[] args) {
        Farmer f1=new Farmer();
        f1.input();
        f1.calculate();
        f1.disp_result();
        f1.total_paid();
    }
}
class Farmer{
    int pa;
    float td;
    static float ri=11.8f;
    float si;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Amount Required: ");
        pa=sc.nextInt();
        System.out.print("Time Duration: ");
        td=sc.nextFloat();
    }
    void calculate(){
        si=(pa*ri*td)/100f;
    }
    void disp_result(){
        System.out.println("Simple interest on "+pa+" in time "+td+" is "+si);
    }
    void total_paid(){
        System.out.print("Total EMI is: "+(si+pa)/(td*12));
    }
}
