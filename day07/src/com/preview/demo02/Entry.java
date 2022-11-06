package com.preview.demo02;

import java.util.Comparator;
import java.util.TreeSet;

public class Entry {

    public static void main(String[] args) {

        // 创建各个学科的平均薪资对象
        Salary javaEESalary = new Salary("JavaEE" , 15756) ;
        Salary htmlSalary = new Salary("HTML&JS+前端" , 14400) ;
        Salary pythonSalary = new Salary("Python+大数据库开发" , 17124) ;
        Salary smartSalary = new Salary("人工智能开发" , 22643) ;
        Salary uiSalary = new Salary("UI/UE设计" , 11530) ;
        Salary testSalary = new Salary("软件测试" , 13145) ;
        Salary mediaSalary = new Salary("新媒体+短视频直播运营" , 11307) ;
        Salary productSalary = new Salary("产品经理" , 16176) ;


        // 补全代码

        TreeSet<Salary> list = new TreeSet<>(new Comparator<Salary>() {
            @Override
            public int compare(Salary o2,Salary o1) {
                int result = o1.getSalary() - o2.getSalary();
//                result = result == 0 ? o1.getDisciplineName().compareTo(o2.getDisciplineName()) : result;//次要条件
                return result;
            }
        });
        list.add(javaEESalary);
        list.add(htmlSalary);
        list.add(pythonSalary);
        list.add(smartSalary);
        list.add(uiSalary);
        list.add(testSalary);
        list.add(mediaSalary);
        list.add(productSalary);
        for (Salary salary : list) {
            System.out.println(salary);
        }
    }

}
