package preview.XmlPrictice;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class xmlDemo {
    //利用dom4j解析xml文件
    public static void main(String[] args) throws DocumentException {
        ArrayList<Student> list = new ArrayList<>();
        /*
        SAXReader reader = new SAXReader();
        Document document = reader.read(url);
        return document;
        */
//        1.获取解析器
        SAXReader sr = new SAXReader();
//        2.利用解析器把xml文件加载到内存中，并返回一个文档对象。
        Document document = sr.read(new File("day16\\src\\preview\\xml\\student.xml"));
//        3.获取根标签
        Element rootElement = document.getRootElement();

//        List elements = rootElement.elements();//获取所有子标签，并把所有子标签放到一个集合中返回
//        System.out.println(elements);
//        System.out.println(elements.size());
//        System.out.println(studentElement.size());
//        获取name标签


//        4.通过根标签获取student标签

        List<Element> studentElement = rootElement.elements("student");//获取标签
        for (Element element : studentElement) {
            Attribute id = element.attribute("id");//获取id属性
            String idValue = id.getValue();

            Element name = element.element("name");//获取子标签name
            String text = name.getText();//获取标签体的内容

            Element age = element.element("age");
            String text1 = age.getText();
            int age1 = Integer.parseInt(text1);

            Student student = new Student(idValue,text,age1);
            list.add(student);
        }
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
