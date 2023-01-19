package JdbcCoonnection;

public class JdbcConnectionUrlPasswordUser {

    private String User = "root"; // change if needed
    private String Url = "jdbc:mysql://localhost/bookDb"; // do not change this!
    private String Password = "admin"; // change if needed


    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
