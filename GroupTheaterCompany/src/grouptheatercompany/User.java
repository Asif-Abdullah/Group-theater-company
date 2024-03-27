/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

public class User {
    protected final String userName;
    protected final int userId;
    protected final String password;
    protected final String userType;

    public User(String userName, int userId, String password, String userType) {
        this.userName = userName;
        this.userId = userId;
        this.password = password;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}

