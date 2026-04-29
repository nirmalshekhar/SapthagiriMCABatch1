package Day5;
import java.util.ArrayList;
public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=1;i<=20;i++){
            list1.add(i);
        }
        System.out.println(list1);
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)>7){
                list1.remove(i);
                i--;
            }
        }
        System.out.println(list1);
    }
}
