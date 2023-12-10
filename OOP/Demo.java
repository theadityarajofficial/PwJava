class Calculator{
//    method overloading
    public int add(int a,int b)
    {
        int result=a+b;
        return result;
    }
    public int add(int a,int b,int c){
        int result =a+b+c;
        return result;
    }
}
public class Demo {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int result= calc.add(4,3);
        int r_s1=calc.add(4,3,2);
        System.out.println(result);
        System.out.println(r_s1);
    }
}
