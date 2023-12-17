public class Anagram {
    public static void main(String[] args) {
        String st1="Keep n";
        String st2="n peek";
        st1=st1.replace( " ","");
        st2=st2.replace(" ","");
        st1 = st1.toLowerCase();
        st2=st2.toLowerCase();
        boolean b=false;
        for (int i=0;i<st1.length();i++){
            for (int j=0;j<st2.length();j++){
                if (st1.charAt(i)==st2.charAt(j)){
                    st1.replace(st1.charAt(i),' ');
                    b=true;
                }
            }
        }
        if (b==true){
            System.out.println("Anagram");
        }
        else {
            System.out.println("not anagram");
        }
    }
}
