import java.util.Scanner;

public class declaration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a[][]=new int[3][];
        a[0]= new int[4];
        a[1]=new int[2];
        a[2]=new int[3];


//        int a[][]=new int[3][2];
//        a[0][0]=5;
//        a[0][1]=2;
//        a[1][0]=8;
//        a[1][1]=2;
//        a[2][0]=9;
//        a[2][1]=4;

//      int a[][]={
//                  {5,2,3,6},
//                  {8,2},              //Jagged array
//                   {9,4,8}
//        };
        for (int i=0;i<3;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]= sc.nextInt();
            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
