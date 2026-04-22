package Day2;
import java.util.Scanner;
public class kaprekar {
    static boolean isKaprekar(int n){
        if(n==1){
            return true;
        }
        int sq=n*n;
        int div=10;
        while(div<=sq)
        {
            int right=sq%div;
            int left=sq/div;
            if(right>0 &&(left+right)==n){
                return true;
            }
            div=div*10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(isKaprekar(n)){
            System.out.println("capricorn Number");
        }
        else{
            System.out.println("Not Capricorn");
        }
    }
}
