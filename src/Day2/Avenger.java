package Day2;
public class Avenger {
    String Name;
    Avenger(String Name){
        this.Name=Name;
    }
    void show(){
        System.out.println("Avengers: "+Name);
    }
    public static void main(String[] args) {
        Avenger a=new Avenger("Iron Man");
        a.show();
    }
}
