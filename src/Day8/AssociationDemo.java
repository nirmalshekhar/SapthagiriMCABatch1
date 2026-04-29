package Day8;
class Teacher{
    String Name;
    Teacher(String Name){
        this.Name=Name;
    }
}
class Student{
    String Name;
    Student(String Name){
        this.Name=Name;
    }
}
public class AssociationDemo {
    public static void main(String[] args) {
        Teacher t=new Teacher("Nirmal");
        Student s=new Student("Kalyan");
        System.out.println(s.Name+" is taught by "+t.Name);

    }
}
