public class TypeCasting {
    public static void main(String[] args) {
        int num1=20;
        double num2=num1; //implicit typecasting
        System.out.println(num2);
        int a;
        double b=45.5d;
        a=(int)b; //explicit typecasting
        double c=a;
        System.out.println(a);
        System.out.println(c);
        int num_a=12;
        int num_b=5;
        float result = num_a/num_b;
        System.out.println(result);
    }
}
