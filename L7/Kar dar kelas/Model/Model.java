package kardarclass.model;

import java.sql.*;

public class Model {
    private String action;
    private String Username;
    private String Email;
    private String Pass;
    private String Name;
    private  boolean swtch=false;
    private String check_Username;

    public String getCheck_Username() {
        return check_Username;
    }

    public void setCheck_Username(String check_Username) {
        this.check_Username = check_Username;
    }

    private String check_Password;

    public String getCheck_Password() {
        return check_Password;
    }

    public void setCheck_Password(String check_Password) {
        this.check_Password = check_Password;
    }

    public boolean getSwtch() {
        return swtch;
    }

    public void setSwtch(boolean swtch) {
        this.swtch = swtch;
    }



    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public void Action()
    {
        try {
            Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
                    , "mehran","mehran123");

            switch (getAction())
            {
                case "Signup":
                    PreparedStatement statement= connection.prepareStatement("INSERT INTO User_t(Username,Password,Name,Email)VALUE (?,?,?,?)");
                    statement.setString(1,getUsername());
                    statement.setString(2,getPass());
                    statement.setString(3,getName());
                    statement.setString(4,getEmail());
                    statement.executeUpdate();
                    setSwtch(true);
                case "Login":
                    Statement statement1=connection.createStatement();
                    ResultSet resultSet=statement1.executeQuery("SELECT *from user_t") ;
                    while (resultSet.next())

                    {
                        setCheck_Username(resultSet.getString("Username"));
                        setCheck_Password(resultSet.getString("Password"));
                    }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
