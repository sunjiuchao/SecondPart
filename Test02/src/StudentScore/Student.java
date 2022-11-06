package StudentScore;

public class Student {
    private String name;
    private int chinses;
    private int math;
    private int english;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinses=" + chinses +
                ", math=" + math +
                ", english=" + english +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinses() {
        return chinses;
    }

    public void setChinses(int chinses) {
        this.chinses = chinses;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public Student(String name, int chinses, int math, int english) {
        this.name = name;
        this.chinses = chinses;
        this.math = math;
        this.english = english;
    }

    public Student(String name) {
        this.name = name;
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        int o1Exam = o1.getChinses() + o1.getMath() + o1.getEnglish();
//        int o2Exam = o2.getChinses() + o2.getMath() + o2.getEnglish();
//        int result = o1Exam - o2Exam;
//
//        return 1;
//    }


}
