public class Concatenation {
    public static void main(String[] args) {
        String S1=new String("PW");
        S1.concat("SKILL");
        System.out.println(S1);
        System.out.println(S1.concat("SKILL"));
        S1=S1.concat("SKILLS");
        System.out.println(S1);


        String obj="I"+"like"+"Java";


        String s1="PWJAVA";
        String s2=s1.concat("SKILL");
        String s3=new String("PWJAVA");
        s3=s1.concat("SKILL");

        String s4=s1+ "Skills";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        String s5="PW"+100+90;
        System.out.println(s5);

        System.out.println(obj);
    }
}
