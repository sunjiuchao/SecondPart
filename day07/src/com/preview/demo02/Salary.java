package com.preview.demo02;

// 使用该实体类来封装就业薪资数据
public class Salary {

    private String disciplineName ;     // 学科名称
    private Integer salary ;            // 平均薪资

    // 有参构造方法
    public Salary(String disciplineName, Integer salary) {
        this.disciplineName = disciplineName;
        this.salary = salary;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" + "disciplineName='" + disciplineName + '\'' + ", salary=" + salary + '}';
    }
}
