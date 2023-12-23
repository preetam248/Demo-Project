package emp_mang;

public class Employee {
    private int id;
    private String name;
    private long cont_no;
    private String email_id;
    private int salary;

    public Employee(int id,String name,long cont_no,String email_id,int salary){
        this.id = id;
        this.name = name;
        this.cont_no = cont_no;
        this.email_id = email_id;
        this.salary = salary;
    }

    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public long getCont_no(){
        return cont_no;
    }
    public String getEmail_id(){
        return email_id;
    }
    public int getSalary(){
        return salary;
    }

    public String toString(){
        String restult = id+" "+name+" "+cont_no+" "+email_id+" " +salary;
        return restult;
    }
}
