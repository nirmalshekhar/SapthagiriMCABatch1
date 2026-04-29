package Day4;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        //1.length()
        System.out.println("Length :"+str.length());
        //2.toUpperCase()
        System.out.println("UpperCase :"+str.toUpperCase());
        System.out.println("Original String :"+str);
        //3. to LowerCase()
        System.out.println("LowerCase:  "+str.toLowerCase());
        //4. charAt(index)
        System.out.println("Character at an index :"+str.charAt(3));
        //5. substring(begin,end)
        System.out.println("Substring :"+str.substring(0,7));
        //6. concat() or '+'
        System.out.println();
        String str1="King ";
        System.out.println("Concat :"+str1.concat(str));
        System.out.println("Using +:"+str1+str);
        //7.equals()
        System.out.println("Equals :"+str.equals("Virat Kohli"));
        //8.equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("virat kohli"));
        //9. replace(old,new)
        System.out.println(str.replace("Virat","VK"));
        //10. trim()
        String s="  "+str+"  ";
        System.out.println(s.trim());
        //11.startsWith()
        System.out.println(str.startsWith("V"));
        //12.endsWith()
        System.out.println(str.endsWith("i"));
        //13.indexOf()
        System.out.println(str.indexOf("r"));
        //14.compareTo()
        System.out.println(str.compareTo("Virat Kohli"));
        //15.split()
        String[] words=str.split(",");
        for(String word:words){
            System.out.println(word);
        }
        //16.isLetter()  17.isDigit()
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetter(c)){
                System.out.println(c+" is a letter");
            }
            else if(Character.isDigit(c)){
                System.out.println(c+" is digit ");
            }
            else{
                System.out.println("Neither Letter or Digit");
            }
        }
    }
}
