package Day3;
//Constructor chaining-> Invoking one constructor to another
public class Batman {
    String Name;
    String city;
    String weapon;
    Batman(String Name){
        this.Name=Name;
        System.out.println("Name :"+Name);
    }
    Batman(String Name,String city){
        this(Name);//Calling constructor with one parameter
        this.city=city;
        System.out.println("Name->"+Name+"City->"+city);
    }
    Batman(String Name,String city,String weapon){
        this(Name,city);//Call constructor with two parameter
        this.weapon=weapon;
        System.out.println("Name "+Name+" city "+city+" weapon "+weapon);
    }
    public static void main(String[] args) {
        Batman b1=new Batman("Bruce Wayne","Gotham","batrang");

    }
}
