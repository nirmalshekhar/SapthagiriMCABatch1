package Day2;
import java.util.Scanner;
public class HappyNumber {
    static boolean isHappy(int n){
        while(n!=1 && n!=4){
            int sum=0;
            while(n>0){
                int d=n%10;
                sum+=d*d;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(isHappy(n)){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Sad Number");
        }
    }
}
