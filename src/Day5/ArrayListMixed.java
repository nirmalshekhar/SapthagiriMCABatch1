package Day5;
import java.util.ArrayList;
public class ArrayListMixed {
    public static void main(String[] args) {
        ArrayList<Object> list1=new ArrayList<>();
        list1.add(45);
        list1.add("Java");
        list1.add('N');
        list1.add(true);
        System.out.println(list1);
    }
}
