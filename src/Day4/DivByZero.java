package Day4;
import java.util.Scanner;
public class DivByZero {
    static int divide(int x,int y)throws ArithmeticException{
        if(y==0){
            throw new ArithmeticException("Divide by Zero is not allowed");
        }
        return x/y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int result=divide(a,b);
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Exception Caught :"+e.getMessage());
        }
        finally{
            System.out.println("Code Executed successfully");
        }
    }
}
