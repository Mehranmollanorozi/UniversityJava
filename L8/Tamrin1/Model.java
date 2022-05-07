package tamrin1;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
    private int Id;
    private String Name;
    private String Family;
    private int Age;
    private String Father;
    private String Job;
    private String Address;
    private String Phone;

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
    public void Database()
    {
        try {
            Connection connection= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/L8","root","myjava123");
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO Homework1(Id,Name,Family_Name,Age,Father_Name,Job,Address,Phone) VALUES (?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,getId());
            preparedStatement.setString(2,getName());
            preparedStatement.setString(3,getFamily());
            preparedStatement.setInt(4,getAge());
            preparedStatement.setString(5,getFather());
            preparedStatement.setString(6,getJob());
            preparedStatement.setString(7,getAddress());
            preparedStatement.setString(8,getPhone());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

