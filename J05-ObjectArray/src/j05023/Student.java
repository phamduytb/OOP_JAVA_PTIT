package j05023;

public class Student {
    private String code, name, grade, email;

    public Student(String code, String name, String grade, String email) {
        this.code = code;
        this.name = name;
        this.grade = grade;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + grade + " " + email;
    }
}
