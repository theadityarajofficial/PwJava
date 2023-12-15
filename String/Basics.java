import java.lang.String;
public class Basics {
    public static void main(String[] args) {
        String brand="PWSKILLS"; //immutable
        StringBuilder brand1=new StringBuilder("PWSKILLS"); //mutable string

        System.out.println(brand);
        brand.concat("Bengaluru");
        System.out.println(brand);
        System.out.println(brand1);
        brand1.append("Bengaluru");
        System.out.println(brand1);
    }
}
