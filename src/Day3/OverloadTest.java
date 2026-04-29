package Day3;
//method Overloading
public class OverloadTest {
    int add(int a,int b){
        System.out.println("Add Two Integers");
        return a+b;
    }
    double add(double a ,double b){
        System.out.println("Add two double");
        return a+b;
    }
    float add(float a,float b){
        System.out.println("Add two floating point");
        return a+b;
    }
    String add(String a,String b){
        System.out.println("Two Strings");
        return a+b;
    }
    public static void main(String[] args) {
        OverloadTest ob=new OverloadTest();
        System.out.println(ob.add(7,18));
        System.out.println(ob.add(6.7,3.9));
        System.out.println(ob.add(4.7f,7.9f));
        System.out.println(ob.add("Virat","Kohli"));

    }
}
