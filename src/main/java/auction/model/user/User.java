public abstract class User extends Entity {
    private String username;
    private String password;
    private String fullName;
    private String email;
    private UserRole role;
    public User(String username, String password, String fullName, String email, UserRole role) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
    }
    public String getUsername {
        return username;
    }
    public String getPassword {
        return password;
    }
    public String getFullName {
        return fullName;
    }
    public String getEmail{
        return email;
    }
    public UserRole getRole{
        return role;
    }
    public void setPassword(String password) {
        this.password = password
    }
    public void setEmail(String email) {
        this.email = email
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}