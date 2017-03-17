import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class EmployeeService {
    public static void main(String args[]) {
        fill();

    }


    public static void   fill(){
            Employee Employee = new Employee();
            LinkedList<Employee> E = new LinkedList<>();
            Scanner in = new Scanner(System.in);
                System.out.println("Введите фамилию сотрудника");
                Employee.Surname = in.next();

                        System.out.println("Введите имя сотрудника");
                Employee.Name = in.next();
                System.out.println("Введите должность сотрудника");
                Employee.Name = in.next();
                System.out.println("Введите зарплату сотрудника");
                Employee.Payment = in.nextInt();


        }

    public void print()

    {

    }

    public void search()

    {

    }

    public void sort() {
    }

}


