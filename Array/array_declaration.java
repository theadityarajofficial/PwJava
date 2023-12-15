public class array_declaration {
    public static void main(String[] args) {
        int a[]={5,4,3,7};
        int num[]=new int[5];
        System.out.print(num[0]+"\n");
//        System.out.println(a[3]);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
//            String names[]=new String[5];
        String names[]={"Aditya","Krish","Adarsh"};
        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
