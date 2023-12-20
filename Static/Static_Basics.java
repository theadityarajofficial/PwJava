public class Static_Basics {

     static int age=20;

    static
    {
        age =10;
        System.out.println("Control in Static block");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        Static_Basics sb=new Static_Basics();
        sb.disp();
        DemoStatic d=new DemoStatic();
//        DemoStatic d1=new DemoStatic();
        DemoStatic.disp1();
        d.disp2();
        d.disp1();
        d.disp3();

//        DemoStatic.disp2();
    }


    void disp(){
        {
            System.out.println(age);
        }
    }

//    static {
//        DemoStatic.disp1();
//    }

}
 class DemoStatic{

    int m,n;
    {
        m=10;
        n=30;
        System.out.println("control in non static or initialization block");
//        instance
//        every time object is created it consumes memory
    }
    void disp3(){
        System.out.println("value of instance ver "+m);
        System.out.println("value of instance var "+n);
    }

    static int age;
    static
    {
        age=18; //java initialization block
    }

     static void disp1(){
        System.out.println("age "+age);
    }
    void disp2(){
        System.out.println(age);
        System.out.println("New disp");
    }
}
