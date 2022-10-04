package j05021;

public class Student implements Comparable<Student> {
    private String code, name, grade, email;

    public Student(String code, String name, String grade, String email) {
        this.code = code;
        this.name = name;
        this.grade = grade;
        this.email = email;
    }


    @Override
    public String toString() {
        return code + " " + name + " " + grade + " " + email;
    }

    @Override
    public int compareTo(Student o) {
        if (this.code.compareTo(o.code) > 0)    return 1;
        return -1;
    }
}
