class Calc{
//    public void show(byte n){
//        System.out.println("byte "+n);
//    }
    public void show(short n){
        System.out.println("short "+n);
    }
//    public void show(char n){
//        System.out.println("char "+n);
//    }
    public void show(int n){
        System.out.println("int "+n);
    }
    public void show(double n){
        System.out.println("double "+n);
    }
}
public class Demo2 {
    public static void main(String[] args) {
        byte b=2;
        char ch='P';
        Calc calc=new Calc();
        calc.show(b);
        calc.show('P');
    }
}
