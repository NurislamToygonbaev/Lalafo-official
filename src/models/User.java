package models;

import role.Role;

public class User {
    public static  Long ID = 1L;
    private Long id;
    private String userName;
    private String gmail;
    private String password;
    private Role role;

    public User(String userName, String gmail, String password, Role role) {
        this.id = ID++;
        this.userName = userName;
        this.gmail = gmail;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User " +
                "id = " + id +
                ", user name = " + userName +
                ", gmail = " + gmail +
                ", password = " + password +
                ", role = " + role + "\n";
    }
}
