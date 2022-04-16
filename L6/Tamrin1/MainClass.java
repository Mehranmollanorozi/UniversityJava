package tamrin1;

import java.sql.*;

public class MainClass {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mehran",
                    "mehran123");
            PreparedStatement preparedStatement1 = connection.prepareStatement("insert into person (employeecode,username,email,password,age,education) values (?,?,?,?,?,?)");
            preparedStatement1.setLong(1,100);
            preparedStatement1.setString(2,"Ali");
            preparedStatement1.setString(3,"Ali100@gmail.com");
            preparedStatement1.setLong(4,123);
            preparedStatement1.setLong(5,19);
            preparedStatement1.setString(6,"bachelor");
            System.out.println ("Insert into DB: "+preparedStatement1.executeUpdate());
            PreparedStatement preparedStatement2 = connection.prepareStatement("select * from person");
            ResultSet resultSet = preparedStatement2.executeQuery();
            System.out.println("Select results are as follows:");
            resultSet.next();
            System.out.println("Usercode: " + resultSet.getString("Usercode"));
            System.out.println("Username: " + resultSet.getString("Username"));
            System.out.println("Email: " + resultSet.getString("Email"));
            System.out.println("Password: " + resultSet.getString("Password"));
            System.out.println("Age: " + resultSet.getString("Age"));
            System.out.println("Education: " + resultSet.getString("Education"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
