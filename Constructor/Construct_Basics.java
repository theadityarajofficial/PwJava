class Stud{
    private String name;
    private int age;
    private char sec;
    Stud(String name,int age){
        this.name=name;
        this.age=age;
        sec='B';
    }
    Stud(String name,int age,char sec){
        this.name=name;
        this.age=age;
        this.sec=sec;
    }
    Stud(){
        System.out.println("Default Branch");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSec() {
        return sec;
    }
    //    Stud(){
//
//    }
    void disp(){
        System.out.println(name+" "+age+" "+sec);
    }

}
public class Construct_Basics {
    public static void main(String[] args) {

        Stud st=new Stud("Aditya",20);
        Stud st1=new Stud("Rahul",30,'A');
        String name=st.getName();
        int age=st.getAge();
        String name1=st1.getName();
        int age1=st1.getAge();
        char sec=st1.getSec();
        System.out.println(name+" "+age);
        System.out.println(name1+" "+age1+" "+sec);
        Stud st2=new Stud();
        st2.disp();
        st.disp();
    }
}
