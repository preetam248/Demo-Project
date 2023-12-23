package emp_mang;
import java.sql.*;
import java.util.ArrayList;
public class EmpDAO {
    
    
    public static void insertData(Employee employee){
        try {
            DBConnection conObj = new DBConnection();
            Connection con = conObj.connect();
            String query = Query.insert;
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, employee.getID());
            pstm.setString(2, employee.getName());
            pstm.setLong(3, employee.getCont_no());
            pstm.setString(4, employee.getEmail_id());
            pstm.setInt(5, employee.getSalary());

            pstm.execute();
            con.close();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }


    public static void deleteData(int id){
        try {
            DBConnection conObj = new DBConnection();
            Connection con = conObj.connect();
            String query = Query.delete;
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            pstm.executeUpdate();
            con.close();

        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public static void updateData(int id,int sal){
        try {
            DBConnection conObj = new DBConnection();
            Connection con = conObj.connect();
            String query = Query.update;

            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, sal);
            pstm.setInt(2, id);
            pstm.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public static ArrayList<Employee> readData(){
        ArrayList<Employee> empl = new ArrayList<>();
            try {
                
                DBConnection conObj = new DBConnection();
                Connection con = conObj.connect();
                String query = Query.read;
                Statement stm = con.createStatement();

                ResultSet rs = stm.executeQuery(query);

                // while (rs.next()) {
                //     System.out.print("id :"+rs.getInt(1)+" ");
                //     System.out.print("name :"+rs.getString(2)+" ");
                //     System.out.print("cont_no :"+rs.getLong(3)+" ");
                //     System.out.print("email_id :"+rs.getString(4)+" ");
                //     System.out.println("salary :"+rs.getInt(5)+" ");
                // }
                while (rs.next()) {
                    Employee emp = new Employee(rs.getInt(1), rs.getString(2),rs.getLong(3), rs.getString(4), rs.getInt(5));
                    empl.add(emp);
                }
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            return empl;
    }


}
