import java.util.*;
public class String_Traversing {
    public static void main(String[] args) {
        String str1="Aditya";
        String str2=new String();
        for (int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        System.out.println(str2);




        String st1="Aditya Raj";
        String st2="";
        String sr[]=st1.split(" ");
        for (int i=sr.length-1;i>=0;i--){
            st2+=sr[i]+" ";
        }
        System.out.println(st2);


        String st3="";
        for (int i= st1.length()-1;i>=0;i--){
            st3+=st1.charAt(i);
        }
        System.out.println(st3);


        String st4="";
        for (int i= 0;i<sr.length;i++){
            for (int j=sr[i].length()-1;j>=0;j--){
                st4+=sr[i].charAt(j);
            }
            st4+=" ";
        }
        System.out.println(st4);

        
//        by using enhanced for loop concept
        String st5="";
        for (String i:sr) {
            for (int j= i.length()-1;j>=0;j--){
                st5+=i.charAt(j);
            }
            st5+=" ";
        }
        System.out.println(st5);
    }
}
