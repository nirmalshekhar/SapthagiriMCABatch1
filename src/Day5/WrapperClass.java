package Day5;

public class WrapperClass {
    public static void main(String[] args) {
        //AutoBoxing: Primitive to Wrapper object
        int a=10;
        Integer obj=a;
        System.out.println("AutoBoxed: "+obj);

        //AutoUnboxing: Wrapper Object to Primitive
        Integer b=20;
        int c=b;
        System.out.println("AutoUnboxed :"+c);

    }
}
