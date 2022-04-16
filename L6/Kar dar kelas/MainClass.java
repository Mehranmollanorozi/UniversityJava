package kardarclass;


import java.sql.*;

public class MainClass {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mehran",
                    "mehran123");
            PreparedStatement preparedStatement1 = connection.prepareStatement("insert into person (name,pass,username,email) values (?,?,?,?)");
            preparedStatement1.setString(1, "ali");
            preparedStatement1.setLong(2, 1234);
            preparedStatement1.setString(3, "ali1234");
            preparedStatement1.setString(4, "ali1234@gmail.com");
            PreparedStatement preparedStatement2 = connection.prepareStatement("select * from person");
            ResultSet resultSet = preparedStatement2.executeQuery();
            System.out.println("Select results are as follows:");
            resultSet.next();
             System.out.println("Name: " + resultSet.getString("name"));
             System.out.println("Pass: " + resultSet.getString("pass"));
             System.out.println("Username: " + resultSet.getString("username"));
             System.out.println("Email: " + resultSet.getString("email"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}