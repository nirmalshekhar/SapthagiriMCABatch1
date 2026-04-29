package Day4;
import java.util.Scanner;
public class StringBufferDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=sc.nextLine();
        StringBuffer sb=new StringBuffer(input);
        //1.append()->adds at last
        sb=sb.append(" Alien Force");
        System.out.println("Append :"+sb);
        //2.insert()-> will add at a specific index
        sb=sb.insert(6,"omnitrix");
        System.out.println("Insert:"+sb);
        //3.replace(start,end,expression)->
        sb=sb.replace(0,6,"Kevin 11");
        System.out.println("Replace :"+sb);
        //4.delete(start,end)
        sb=sb.delete(0,8);
        System.out.println("Delete :"+sb);
        //5.reverse()
        System.out.println("Reverse : "+sb.reverse());
        //6.length()
        System.out.println("Length :"+sb.length());
        //7.capacity()
        System.out.println("Capacity :"+sb.capacity());
        //8.charAt(index)
        System.out.println("charAT() :"+sb.charAt(2));
        //9.setCharAt()-> void return type
        sb.setCharAt(4,'X');
        System.out.println("setCharAt() :"+sb);
    }
}
