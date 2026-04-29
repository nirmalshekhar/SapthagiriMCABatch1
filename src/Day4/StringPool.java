package Day4;
// == and .equals()
public class StringPool {
    public static void main(String[] args) {
        String s1="RCB";
        String s2="RCB";
        String s3=new String("RCB");
        String s4=new String("RCB");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s4));
//intern()->method forces string to return a
// reference from the string pool instead of heap
        String s5=s4.intern();
        System.out.println(s1==s5);
    }
}
