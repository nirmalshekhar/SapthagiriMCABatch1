package Day3;
class SuperHero{
    void fight(){
        System.out.println("SuperHeroes Save World");
    }
}
class SuperMan extends SuperHero{
    void identity(){
        System.out.println("Henry Cavill");
    }
}
class WonderWomen extends SuperHero{
    void identity1(){
        System.out.println("Gal gadot");
    }
}
public class DC {
    public static void main(String[] args) {
        SuperMan s=new SuperMan();
        s.fight();
        s.identity();

        WonderWomen w=new WonderWomen();
        w.identity1();
        w.fight();

    }
}
