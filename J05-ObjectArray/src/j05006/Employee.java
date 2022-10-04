package j05006;

public class Employee {
    private String eCode, name, sex, dOB, address, tCode, cDate;

    public Employee(int stt,String name, String sex, String dOB, String address, String tCode, String cDate) {
        this.eCode = String.format("%05d", stt);
        this.name = name;
        this.sex = sex;
        this.dOB = chuanHoa(dOB);
        this.address = address;
        this.tCode = tCode;
        this.cDate = chuanHoa(cDate);
    }

    private String chuanHoa(String date) {
        String s[] = date.split("/");
        if (s[0].length() == 1) s[0] = "0" + s[0];
        if (s[1].length() ==1) s[1] = "0" + s[1];
        return s[0] + "/" + s[1] + "/" + s[2];

    }

    @Override
    public String toString() {
        return eCode + " " + name + " " + sex + " " + dOB
                + " " + address + " " + tCode + " " + cDate;
    }
}
