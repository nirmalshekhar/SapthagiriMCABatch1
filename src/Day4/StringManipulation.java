package Day4;
public class StringManipulation {
    public static void main(String[] args) {
        String str1="Rocky";
        String str2="Rocky";
        String str3="Garuda";
        String str4="Adheera";
        //Uisng equals()
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        //Using compareTo
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str4.compareTo(str1));

    }
}
