package Study.ChangeStream;

import Study.Student;

import java.io.*;

public class SaveDemo02 {
    public static void main(String[] args) throws Exception {
//        当对用户用户名密码写入文件时不能直接写入，
//        可以把对象以直接的形式写人文件中，打开文件时需要对象操作流才能读到内存中
//        对象操作流分为两类：
//           对象操作输出流 (对象序列化流  ) ->将对象写入到本地文件中，或者传输在网络中的对象
//           对象操作输入流 (对象反序列化流) ->将本地写的对象读到内存中，或者接收在网络中的对象

//        修改JavaBean
//        把javaBean里面的Private修改成public-->程序报错
//        InvalidClassException
//        Study.Student; local class incompatible: stream classdesc
//        serialVersionUID = 8143132367758616357, local class serialVersionUID = -7864622633494018517
//        serialVersionUID = 8143132367758616357  序列号
//        如果我们没有定义，虚拟机会自动根据类中的信息计算出一个序列号
//        修改信息学hi后，虚拟机会再次计算出序列号，读入到内存时，虚拟机发现不一样会报错
//        解决方法：不然虚拟机自动计算，我们手动计算出，而且让他保持不变。
//        在JavaBean中写一个静态的UID
//        如果不想把对象中的数据传入本地，可以在成员变量前面隐藏值加上transient就行
        methodRead();
    }



    private static void methodWrite() throws IOException {
        Student stu = new Student("sunjiuchao", "1234");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\c.txt"));
        oos.writeObject(stu);
        oos.close();
    }

    private static void methodRead() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\c.txt"));
        Object student_message =(Student) ois.readObject();
        System.out.println(student_message);
        ois.close();
    }
}
