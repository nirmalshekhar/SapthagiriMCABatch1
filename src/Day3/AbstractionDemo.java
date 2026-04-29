package Day3;
abstract class Omnitrix{
    String owner;
    Omnitrix(String owner){
        this.owner=owner;
        System.out.println("Omnitrix is set for:"+owner);
    }
    abstract void transform();
    void activate(){
        System.out.println("Omnitrix Activated");
    }
}
class Ben10 extends Omnitrix{
    Ben10(String owner){
        super(owner);
    }
    @Override
    void transform(){
        System.out.println(owner+"transforms to ABD");
    }

}
public class AbstractionDemo {
    public static void main(String[] args) {
        Omnitrix ben=new Ben10("Ben 10 Alien Force");
        ben.activate();
        ben.transform();
    }
}
