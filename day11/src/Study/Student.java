package Study;

import java.io.Serializable;

//如果想要Student类被对象实例化需要实现Serializable接口
//Serializable接口里面没有任何操作，只是标识一下，对象被序列化而已
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
//    private transient String password;

    public Student() {
    }

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
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
}
