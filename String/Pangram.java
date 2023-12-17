public class Pangram {
    public static void main(String[] args) {
        String str="The Quick Brown Fox Jumps Over Lazy Dog";
        str=str.replace(" ","");
        str=str.toUpperCase();
        char ar[]=str.toCharArray();
        int arr[]=new int[26];
        boolean temp=false;
        for(int i=0;i<ar.length;i++){
            arr[ar[i]-65]++;
        }
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                temp = true;
            }
        }
        if(temp==true){
            System.out.println("It is not pangram");
        }
        else {
            System.out.println("IT is pangram");
        }
    }
}
