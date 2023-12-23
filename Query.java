package emp_mang;

public class Query {
    public static String insert = "INSERT INTO employee(id,name,cont_no,email_id,salary) VALUES (?,?,?,?,?)";
    public static String read = "SELECT * FROM employee";
    public static String update = "UPDATE employee SET salary = ? WHERE id = ?";
    public static String delete = "DELETE FROM employee WHERE id = ?";
}
