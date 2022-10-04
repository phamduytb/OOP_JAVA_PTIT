package j05004_b;

public class Student {
    private String name, dateOfBrith, clas;
    private double gpa;

//    sCode static dungf chung cho các đối tượng của lớp
    private static int  sCode;

    public Student(String name, String clas, String dateOfBrith, double gpa) {
        this.name = standardName(name);

        this.clas = clas;
        this.dateOfBrith = dOB(dateOfBrith) ;
        this.gpa = gpa;
        this.sCode++;
    }

    private String standardName(String name) {
//        split("\\s+") tách chuỗi dựa trên khoảng trắng ( khoảng trắng rất nhiều)
        String s[] = name.trim().split("\\s+");
        String tmp = "";
        for (int i = 0; i < s.length; i++) {
            tmp += s[i].substring(0,1).toUpperCase();
            tmp += s[i].substring(1).toLowerCase();
            tmp += " ";
        }
        return tmp;
    }

    private String dOB(String dateOfBrith) {
        String dob[] = dateOfBrith.split("/");
        if(dob[0].length() == 1) dob[0] = "0" + dob[0];
        if(dob[1].length() == 1) dob[1] = "0" + dob[1];
        return dob[0] + "/" + dob[1] + "/" + dob[2];
    }
     private String code(int sCode) {
        if(sCode < 10 ) return "B20DCCN00" + sCode;
        return "B20DCCN0" + sCode;
     }

    @Override
    public String toString() {
        return code(sCode) + " " + name + " " + clas + " " +
                dateOfBrith + " " + String.format("%.2f", gpa);
    }
}
