public class PrimitiveDatatypes {
    public static void main(String[] args) {
//        for min or max data formula =2^n-1 to 2^(n-1)-1. n=no. of bits like 1byte=8bit
        byte b=127;
//         byte-1byte can stores data from -2^8-1 to 2^(8-1) -1 .
        short s=545;
//        short -2byte can stores data from -2^16-1 to 2^(16-1) -1 .
        int i=251546;
//        int -4byte can stores data from -2^32-1 to 2^(32-1) -1 .
        long lo=665l;
//        long -8byte stores from -2^64-1 to 2^(64-1)-1 .
        float fl=3.14f;
//        float -4bytes
        double d=3.14735d;
//        double uses 8byte
        char a='a'; // ascii( American Standard Code for Information Interchange)
//        char uses 2byte java follows utf(Unicode Transformation Format) java doesnot follow ascii
        System.out.print(b+"\n"); //use of "\n" for line change
        System.out.println(s); //use of println for line change
        System.out.println(i);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(d);
    }
}
