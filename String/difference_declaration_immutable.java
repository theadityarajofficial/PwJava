public class difference_declaration_immutable {
    public static void main(String[] args) {
        String S1="PW";
        String S2="PW";
        String S3=new String("PWSKILLS");
        String S4=new String("PWSKILLS");
        System.out.println(S1==S2);
        System.out.println(S3==S4);
        String s=new String();
        System.out.println(s);
    }
}
