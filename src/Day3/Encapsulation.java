package Day3;
class Employee{
    private String name;
    private double salary;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        if(salary>0){
            this.salary=salary;
        }
        else{
            System.out.println("Invalid salary");
        }
    }
    public double getSalary(){
        return salary;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setName("Kalyan");
        e.setSalary(50000.0);
        System.out.println("Emp name : "+e.getName());
        System.out.println("Salary :"+e.getSalary());
        e.setSalary(100000.0);
        System.out.println("Updated Salary:"+e.getSalary());
    }
}
