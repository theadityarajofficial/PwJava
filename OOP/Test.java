class Test {
    int a=25;
    String name="Hawked Eye";
// they are instane variable
    public static void main(String[] args) {
//        declare the variable
//        create the object
        int num=9; //primitive
        int num2;
        String s="Aditya"; //primitive
//        they are local variable
        Test t=new Test(); //refrence
        Test t1=new Test();
        Test t2=new Test();
        t.a =20;
        t.name =s;
//        all objects are independent
        System.out.println(t.name+" "+t.a);
        System.out.println(t1.name+" "+t2.a);
        System.out.println(t2.name+" "+t2.a);
    }
}
