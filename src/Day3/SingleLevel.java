package Day3;
class Animal{
    void sound(){
        System.out.println("Animals make sound!!");
    }
}
class cat extends Animal{
    void sound1(){
        System.out.println("Meow meow");
    }
}
class Kitten extends cat{
    void sound2(){
        System.out.println("Kit Kat");
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        cat c=new cat();
        c.sound1();
        c.sound();

        Animal a=new Animal();
        a.sound();
        //a.sound1();
        Kitten k=new Kitten();
        k.sound();
        k.sound1();
        k.sound2();

    }
}
