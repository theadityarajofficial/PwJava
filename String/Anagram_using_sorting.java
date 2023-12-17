import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram_using_sorting {
    public static void main(String[] args) {
        String st1="Keep n";
        String st2="n peek";
        st1=st1.replace( " ","");
        st2=st2.replace(" ","");
        st1 = st1.toLowerCase();
        st2=st2.toLowerCase();
        char[] ar1= st1.toCharArray();
        char[] ar2= st2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if (Arrays.equals(ar1,ar2)){
            System.out.println("Is is Anagram");
        }
        else
        {
            System.out.println("It is not an anagram");
        }
    }
}
