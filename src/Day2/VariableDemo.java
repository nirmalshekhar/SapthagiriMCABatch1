package Day2;
public class VariableDemo {
    int instVar=10;//Instance variable
    static int staticVar=20;//Static->can be directly called even without creating the object
    final int finalVar=60;//can't be changed
    public static final String GLOBAL_VAR="KGF2";//constant
    void showVariable(int paraVar){
        int LocalVar=40;//life cycle is confined to the scope
        System.out.println("Instance Variable :"+instVar);
        System.out.println("Static Variable :"+staticVar);
        System.out.println("Final Variable :"+finalVar);
        System.out.println("Parameter Variable :"+paraVar);
        System.out.println("Global Constant : "+GLOBAL_VAR);
        System.out.println("Local Variable :"+LocalVar);
    }

    public static void main(String[] args) {
        System.out.println(staticVar);
        VariableDemo v=new VariableDemo();
        System.out.println(v);
        v.showVariable(80);
        System.out.println("Instance Variable :"+v.instVar);
        //System.out.println("Local "+v.LocalVar);->killing local variable by calling outside the scope
        System.out.println("Final Variable "+v.finalVar);
        //v.finalVar=40;->final Variables cant be modified


    }
}
