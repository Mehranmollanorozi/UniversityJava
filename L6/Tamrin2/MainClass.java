package tamrin2;

import java.sql.*;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mehran",
                    "mehran123");
            PreparedStatement preparedStatement1 = connection.prepareStatement("insert into person (employeecode,employeename,melicode,fathername,responsibility,rights,workexperience) values (?,?,?,?,?,?,?)");
            System.out.println("Enter employeecode");
            preparedStatement1.setLong(1,scanner.nextInt());
            System.out.println("Enter employeename");
            preparedStatement1.setString(2,scanner.next());
            System.out.println("Enter melicode");
            preparedStatement1.setLong(3,scanner.nextInt());
            System.out.println("Enter fathername");
            preparedStatement1.setString(4,scanner.next());
            System.out.println("Enter responsibility");
            preparedStatement1.setString(5,scanner.next());
            System.out.println("Enter rights");
            preparedStatement1.setLong(6,scanner.nextInt());
            System.out.println("Enter workexperience");
            preparedStatement1.setLong(7,scanner.nextInt());
            PreparedStatement preparedStatement2 = connection.prepareStatement("select * from person");
            ResultSet resultSet = preparedStatement2.executeQuery();
            System.out.println("Select results are as follows:");
            resultSet.next();
            System.out.println("Employeecode: " + resultSet.getString("Employeecode"));
            System.out.println("Employeename: " + resultSet.getString("Employeename"));
            System.out.println("Melicode: " + resultSet.getString("Melicode"));
            System.out.println("Fathername: " + resultSet.getString("Fathername"));
            System.out.println("Responsibility: " + resultSet.getString("Responsibility"));
            System.out.println("Rights: " + resultSet.getString("Rights"));
            System.out.println("Workexperience: " + resultSet.getString("Workexperience"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
