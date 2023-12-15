public class basic {
    public static void main(String[] args) {
        int a[]={5,4,7,3};
        int n[][]={
                {5,2,3,6},
                {8,3,6,4},
                {9,4,8,1}
        };
        for (int i:a) {
            System.out.println(i);
        }
        for (int t[]:n) {
            for (int f:t) {
                System.out.print(f+" ");
            }
            System.out.println();
        }
    }
}
