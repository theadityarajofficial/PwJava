import java.nio.file.attribute.UserPrincipalLookupService;

public class Inbuilt_Mehods {
    public static void main(String[] args) {
        String str="Aditya";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(5));
        int length=str.length();
        System.out.println(str.substring(2));
        System.out.println(str.substring(0,4));
        System.out.println(str.concat(" Raj"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
    }
}
