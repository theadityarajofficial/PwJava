public class String_BufferBuilderCapacity {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("q");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuilder sbr=new StringBuilder();
        System.out.println(sbr.capacity());


        StringBuffer stb=new StringBuffer("Aditya");
        System.out.println(stb.capacity());
        System.out.println(stb.charAt(1));
        stb.setCharAt(0,' ');
        System.out.println(stb);

        StringBuilder sbt=new StringBuilder(150);
        System.out.println(sbt.capacity());
        sbt.append("Java");
        System.out.println(sbt);
        sbt.trimToSize();
        System.out.println(sbt.capacity());



        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
