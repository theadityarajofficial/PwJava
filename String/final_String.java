public class final_String {
    public static void main(String[] args) {
        final StringBuilder sb=new StringBuilder("Aditya");
        sb.append(" Raj");
//        sb=new StringBuilder("Nikhil"); new object creation with same refrence not possible CE

        System.out.println(sb);
    }
}
