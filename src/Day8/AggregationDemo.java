package Day8;
class Department{
    String deptName;
    Department(String deptName){
        this.deptName=deptName;
    }
}
class College{
    String collName;
    Department  department;
    College(String collName,Department department){
        this.collName=collName;
        this.department=department;
    }
    void display(){
        System.out.println(collName+" has departement "+department.deptName);
    }
}
public class AggregationDemo {
    public static void main(String[] args) {
        Department dept=new Department("MCA");
        College c=new College("Sapthagiri",dept);
        c.display();
    }
}
