public class Palindrome {
    public static void main(String[] args) {
        String st="aka";
        String st2="";
        for (int i=st.length()-1;i>=0;i--){
            st2+=st.charAt(i);
        }
        System.out.println(st2.equals(st));
    }
}
