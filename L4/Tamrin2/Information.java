package tamrin2;

public class Information<First,Second> {
    private First username;
    private Second password;

    public First getUsername() {
        return username;
    }

    public void setUsername(First username) {
        this.username = username;
    }

    public Second getPassword() {
        return password;
    }

    public void setPassword(Second password) {
        this.password = password;
    }
}
