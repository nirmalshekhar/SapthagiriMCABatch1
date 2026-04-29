package Day3;
public class Student {
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    Student(){
        System.out.println("Rohit Sharma");
    }
    void display(){
        System.out.println("Name : "+name+" <->Age : "+age);
    }
    public static void main(String[] args) {
        Student ob=new Student("Virat",37);
        Student ob2=new Student();
        ob.display();
        ob2.display();

    }
}
