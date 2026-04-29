package Day5;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class ArrayListOperations {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        //1.add()->add an element at the last
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println("ArrayList :"+l1);
        l1.add(3,60);
        System.out.println(l1);
        //2.get(index)->Access Element
        System.out.println("Element at index:"+l1.get(2));
        //3.set(index,value)->update an element
        l1.set(3,45);
        System.out.println("Updated list :"+l1);
        //4.Remove Element->Remove by index/Remove by value
        l1.remove(3);//Remove by index
        System.out.println(l1);
        l1.remove(Integer.valueOf(30));//Remove by value
        System.out.println(l1);
        //5.size()->Calculates the size of ArrayList
        System.out.println("Size :"+l1.size());
        //6.contains()->search an element
        System.out.println(l1.contains(20));
        //7.indexOf()->returns the index of element
        System.out.println(l1.indexOf(40));
        //8.sort the list
        Collections.sort(l1);
        System.out.println(l1);
        //9.clear()-> clear the list
        l1.clear();
        System.out.println(l1);
    }
}
