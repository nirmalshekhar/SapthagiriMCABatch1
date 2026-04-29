package Day3;
interface KGF{
    String HERO="RockingStar Yash";
    String WEAPON="KalasNikov";
    void fight();//abstract method
    default void dialogue(){
        System.out.println("Violence.... Violence");
    }
}
class Rocky implements KGF{
    @Override
    public void fight(){
        System.out.println(HERO +" fights using "+ WEAPON);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        KGF k=new Rocky();
        k.dialogue();
        k.fight();
    }
}
