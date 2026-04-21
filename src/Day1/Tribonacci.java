package Day1;
import java.util.Scanner;
public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=1;
        System.out.println("Tribonacci series ");
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int d=a+b+c;
            a=b;
            b=c;
            c=d;

        }
    }
}
