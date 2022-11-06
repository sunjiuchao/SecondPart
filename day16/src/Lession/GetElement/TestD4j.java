package Lession.GetElement;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

public class TestD4j {
    public static void main(String[] args) throws DocumentException {
        ArrayList<Student> list = new ArrayList<>();
        ArrayList<Teacher> list1 = new ArrayList<>();
        SAXReader reader = new SAXReader();//获取解析器对象
        Document document = reader.read("day16\\src\\Lession\\Xml\\student.xml");//获取xml文件
        Element rootElement = document.getRootElement();//获取根标签

        System.out.println("*************学生*************");
        List<Element> elements = rootElement.elements("student");
        for (Element element : elements) {//子标签
            Attribute attributeId = element.attribute("id");
            String valueId = attributeId.getValue();

            Element elementName = element.element("name");
            String name = elementName.getText();

            Element elementAge = element.element("age");
            String ageText = elementAge.getText();
            int age = Integer.parseInt(ageText);
            list.add(new Student(name,age));
            System.out.println(valueId+":"+name+" "+ageText);
        }
        for (Student student : list) {
            System.out.println(student);
        }


        System.out.println("*************老师*************");
        List<Element> elementTeacher = rootElement.elements("teacher");
        for (Element element : elementTeacher) {
            Attribute teacherId = element.attribute("id");
            String valueId = teacherId.getValue();
            Element teacherName = element.element("name");
            String name = teacherName.getText();
            Element teacherage = element.element("age");
            String agetext = teacherage.getText();
            int age = Integer.parseInt(agetext);
            list1.add(new Teacher(name,age));
            System.out.println(valueId+":"+name+" "+age);
        }

        for (Teacher teacher : list1) {
            System.out.println(teacher);
        }

    }
}
