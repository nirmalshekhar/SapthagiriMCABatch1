package Day2;
import java.util.Scanner;
public class Armstrong {
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        int count=0;
        int temp=n;
        while(temp>0){
            count++;
            temp/=10;
        }
        while(n>0){
            int d=n%10;
            sum+=Math.pow(d,count);
            n=n/10;
        }
        return sum==original;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
