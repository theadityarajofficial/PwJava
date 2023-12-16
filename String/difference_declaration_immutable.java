public class difference_declaration_immutable {
    public static void main(String[] args) {
        String S1="PWSKILLS";
        String S2="PWSKILLS";
        String S3=new String("PWSKILLS");
        String S4=new String("PWSKILLS");
        String S5="PwSkills";
        System.out.println(S1==S2);
        System.out.println(S3==S4);
        String s=new String();
        System.out.println(s);
        System.out.println(S1.equals(S3));
        System.out.println(S1.equals(S5));
        System.out.println(S1.equalsIgnoreCase(S5));
    }
}
