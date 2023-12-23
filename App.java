package emp_mang;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice: 1-For Insertion OR 2-For Deletion OR 3-For Updation OR 4-For Read Data");
        int choice = sc.nextInt();
        if (choice<1 || choice>4) {
            System.out.println("enter valid input");
            return;
        }
        switch (choice) {
            case 1:
                System.out.println(" enter id: ");
                int id = sc.nextInt();

                System.out.println("enter name: ");
                String name = sc.next();

                System.out.println("enter contact no.: ");
                long cont = sc.nextLong();

                System.out.println("enter email ID: ");
                String email = sc.next();

                System.out.println("enter salary");
                int sal = sc.nextInt();

                Employee emp = new Employee(id, name, cont, email, sal);
                EmpDAO.insertData(emp);
                System.out.println("insertion successful");
                break;
        
           case 2:
                System.out.println("enter id");
                int n = sc.nextInt();

                EmpDAO.deleteData(n);
                System.out.println("delete successful");
                break;

          case 3:
                System.out.println("enter id");
                int x = sc.nextInt();
                System.out.println("enter updated salary");
                int y = sc.nextInt();
                EmpDAO.updateData(x, y);
                System.out.println("update successfull");
                break;
          case 4:
                ArrayList<Employee> list = EmpDAO.readData();
                for(Employee ele : list){
                    System.out.println(ele);
                }     
                break;

        }
        
    }
}
