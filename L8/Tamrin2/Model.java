package tamrin2;

import com.sun.jdi.connect.spi.Connection;

import java.sql.*;

public class Model {
    boolean swtch=false;

    public int getEdit_Id() {
        return Edit_Id;
    }

    public void setEdit_Id(int edit_Id) {
        Edit_Id = edit_Id;
    }

    private int Edit_Id;
    private String Check_Username;
    private String Check_Password;
    private String Username;
    private String Password;
    private int Id;
    private String Name;
    private String Family;
    private int Age;
    private String Father;
    private String Job;
    private String Address;
    private String Phone;

    public String getCheck_Username() {
        return Check_Username;
    }

    public void setCheck_Username(String check_Username) {
        Check_Username = check_Username;
    }

    public String getCheck_Password() {
        return Check_Password;
    }

    public void setCheck_Password(String check_Password) {
        Check_Password = check_Password;
    }
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getFather() {
        return Father;
    }

    public void setFather(String father) {
        Father = father;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    public void Database()
    {
        try {
            Connection connection= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/L8","root","myjava123");
            Statement statement= ((java.sql.Connection) connection).createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM Homework2");
            while (resultSet.next())
            {
                setCheck_Username(resultSet.getString("Username"));
                setCheck_Password(resultSet.getString("Password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean Check()
    {
        if (getUsername().equals(getCheck_Username()) && getPassword().equals(getCheck_Password()))
        {
            swtch=true;
        }
        return swtch;

    }
    public void Database2()
    {
        try {
            Connection connection2= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/L8","root","myjava123");
            PreparedStatement preparedStatement2=connection2.prepareStatement("update Homework1 set Id=?,Name=?,Family_Name=?,Age=?,Father_Name=?,Job=?,Address=?,Phone=? where Id=?");
            preparedStatement2.setInt(1,getId());
            preparedStatement2.setString(2,getName());
            preparedStatement2.setString(3,getFamily());
            preparedStatement2.setInt(4,getAge());
            preparedStatement2.setString(5,getFather());
            preparedStatement2.setString(6,getJob());
            preparedStatement2.setString(7,getAddress());
            preparedStatement2.setString(8,getPhone());
            preparedStatement2.setInt(9,getEdit_Id());
            preparedStatement2.executeUpdate();
            preparedStatement2.close();
            connection2.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
