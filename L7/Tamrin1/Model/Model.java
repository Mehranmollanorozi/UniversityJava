package tamrin1.model;

import oracle.net.aso.e;

import java.sql.*;

public class Model {
    private String Username;
    private String password;
    String check_Username;
    String check_Password;
    private boolean key = false;
    private String Gig_number;
    private String Volume_Gig;
    private int Price_Gig;

    public String getVolume_Gig() {
        return Volume_Gig;
    }

    public void setVolume_Gig(String volume_Gig) {
        Volume_Gig = volume_Gig;
    }

    public int getPrice_Gig() {
        return Price_Gig;
    }

    public void setPrice_Gig(int price_Gig) {
        Price_Gig = price_Gig;
    }

    public String getGig_number() {
        return Gig_number;
    }

    public void setGig_number(String gig_number) {
        Gig_number = gig_number;
    }

    public boolean getkey() {
        return key;
    }

    public boolean setkey(boolean key) {
        this.key = key;
        return key;
    }

    public Model() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUsername() {
        return Username;
    }

    public void Check() {

        try {
            Connection connection2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mehran", "mehran123");
            Statement statement = connection2.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from person");
            while (resultSet.next()) {
                check_Username = resultSet.getString("Username");
                check_Password = resultSet.getString("Password");
            }
            if (getUsername().equals(check_Username) && getPassword().equals(check_Password)) {
                setkey(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void Choose() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/L7", "root", "myjava123");
            Statement statement = connection.createStatement();
            switch (getGig_number()) {
                case "2Gig":
                    ResultSet resultSet = statement.executeQuery("select *from net where Gig='2Gig'");
                    while (resultSet.next()) {
                        setVolume_Gig(resultSet.getString("Gig"));
                        setPrice_Gig(resultSet.getInt("Price"));
                    }
                case "4Gig":
                    ResultSet resultSet2 = statement.executeQuery("select *from net where Gig='4Gig'");
                    while (resultSet2.next()) {
                        setVolume_Gig(resultSet2.getString("Gig"));
                        setPrice_Gig(resultSet2.getInt("Price"));
                    }
                case "10Gig":
                    ResultSet resultSet3 = statement.executeQuery("select *from net where Gig='10Gig'");
                    while (resultSet3.next()) {
                        setVolume_Gig(resultSet3.getString("Gig"));
                        setPrice_Gig(resultSet3.getInt("Price"));
                    }
                case "25Gig":
                    ResultSet resultSet4 = statement.executeQuery("select *from net where Gig='25Gig'");
                    while (resultSet4.next()) {
                        setVolume_Gig(resultSet4.getString("Gig"));
                        setPrice_Gig(resultSet4.getInt("Price"));
                    }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
