class Add{
    int add(int arr[]){
        int result=0;
        for (int i:arr) {
            result+=i;
        }
        return result;
    }
}
public class Anonymous_Array {
    public static void main(String[] args) {
//        int arr[]={5,3,4,7};
        Add a=new Add();
        System.out.println(a.add(new int[]{5,3,4,7}));//anonymous array
    }
}
