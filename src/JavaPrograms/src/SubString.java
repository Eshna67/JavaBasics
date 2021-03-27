public class SubString {
    public static void main(String[] args) {
        String s="geeks is gfg";
        System.out.println(s.substring(1,5));
        System.out.println(s.subSequence(1,5));
    }
}
/*
substring in the inclusive range from start to end-1.
 */