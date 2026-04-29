package Day3;
class Bahubali{
    void fight(){
        System.out.println("Amrendra Bahubali fights");
    }
}
class MahendraBahubali extends Bahubali{
    @Override
    void fight(){
        System.out.println("Mahendra fights");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Bahubali b=new MahendraBahubali();
        b.fight();

    }
}
