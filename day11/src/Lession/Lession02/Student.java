package Lession.Lession02;

import java.io.Serializable;

public class Student implements Serializable {
    /** Serializable
     * 标记性接口，没有任何的抽象方法
     * 只要实现就表示，序列化本地标识
     */
    private static final long serialVersionUID = 1L;
    private String username;
    private transient String password;


    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student() {
    }
}
