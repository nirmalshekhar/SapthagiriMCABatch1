package Day1;

public class Swap {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println("Before Swapping :"+a+" "+b);
        //Using temporary variable
//        int temp=a;
//        a=b;
//        b=temp;
        //Using Add and sub
//        a=a+b;
//        b=a-b;
//        a=a-b;
        //using Mul and Div
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After Swapping :"+a+" "+b);
    }
}
