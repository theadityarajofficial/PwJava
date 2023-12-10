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
        int numa=12;
        int numb=5;
        float result = (float)(numa/numb);
        System.out.println(result);
    }
}
