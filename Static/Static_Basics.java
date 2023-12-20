public class Static_Basics {

     static int age;


    public static void main(String[] args) {
        System.out.println("Hello");
        disp();
        DemoStatic d=new DemoStatic();
        DemoStatic.disp1();
        d.disp2();
        d.disp1();
//        DemoStatic.disp2();
    }


    static
    {
        age =10;
        System.out.println("Static block");
    }

    static void disp(){
        {
            System.out.println(25);
        }
    }
    static {
        disp();
    }

    int age1=5;
    {
        System.out.println(age1);
    }

    static {
        DemoStatic.disp1();
    }

}
class DemoStatic{
    int age=20;

    static void disp1(){
        DemoStatic ds=new DemoStatic();
        System.out.println(ds.age);
    }
    void disp2(){
        System.out.println("New disp");
    }
}
