package emp_mang;
import java.sql.*;
public class DBConnection {
   
    public Connection conn = null;
   
   public Connection connect(){
        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "PBD@1998";

        conn = DriverManager.getConnection(url, user, password);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
   }

}
