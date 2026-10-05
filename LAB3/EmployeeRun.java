package LAB3;
import java.util.Scanner;
class Employee{
    private String employee_id;
    private String employee_name;

    public void setId(String employee_id){
        this.employee_id = employee_id;
    }

    public String getId(){
        return employee_id;
    }


    public void setName(String employee_name){
        this.employee_name = employee_name;
    }

    public String getName(){
        return employee_name;
    }

    public void displayDesignate(){
        System.out.println("Employee id is: " + employee_id + "\nEmployee name is: " + employee_name);
    }


}

public class EmployeeRun {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Employee e1= new Employee();
        System.out.print("Enter employee id: ");
        String id = sc.nextLine();
        e1.setId(id);
        //System.out.println("Empoyee id is: "+ e1.getId());

        System.out.print("Enter employee name: ");
        String name= sc.nextLine();
        e1.setName(name);
        //System.out.println("Employee name is: "+ e1.getName());

        e1.displayDesignate();
    }

}
