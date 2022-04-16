package tamrin3;

import java.sql.*;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mehran",
                    "mehran123");
            PreparedStatement preparedStatement1 = connection.prepareStatement("insert into person (studentID,studentname,yearofentry,StudentGPA) values (?,?,?,?)");
            System.out.println("Enter studentID");
            preparedStatement1.setLong(1,scanner.nextInt());
            System.out.println("Enter studentname");
            preparedStatement1.setString(2,scanner.next());
            System.out.println("Enter yearofentry");
            preparedStatement1.setLong(3,scanner.nextInt());
            System.out.println("Enter studentGPA");
            preparedStatement1.setLong(4,scanner.nextInt());
            preparedStatement1.executeUpdate();
            PreparedStatement preparedStatement2 = connection.prepareStatement("select * from person");
            ResultSet resultSet = preparedStatement2.executeQuery();
            System.out.println("Select results are as follows:");
            resultSet.next();
            System.out.println("StudentID: " + resultSet.getString("StudentID"));
            System.out.println("Studentname: " + resultSet.getString("Studentname"));
            System.out.println("yearofentry: " + resultSet.getString("yearofentry"));
            System.out.println("StudentGPA: " + resultSet.getString("StudentGPA"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
