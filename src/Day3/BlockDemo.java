package Day3;
public class BlockDemo {
    int x;//Instance variable
    //Static block
    static{
        System.out.println("Hello Folks");
    }
    //IIB->Instance Initialization block
    {
        x=10;
        System.out.println("IIB: x="+x);
    }
    BlockDemo(int x){
        this.x=x;
        System.out.println("Constructor called: "+x);
    }
    public static void main(String[] args) {
        BlockDemo b=new BlockDemo(50);
        BlockDemo b1=new BlockDemo(70);

    }
}
