import java.util.*;
public class String_Traversing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=new String();
        for (int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        System.out.println(str2);

        String st1="Aditya Raj";
        String st2="";
        String sr=st1.split(" ")
//        for (int i=0;i<st1.length()-1;i++){
//        }
    }
}
