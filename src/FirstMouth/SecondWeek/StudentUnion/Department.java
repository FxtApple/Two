package FirstMouth.SecondWeek.StudentUnion;

public class Department {
    public int departmentID;
    public String name;
    public int studentMount;
    //学生会部长
    public Student buZhang;

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public Student getBuZhang() {
        return buZhang;
    }

    public void setBuZhang(Student buZhang) {
        this.buZhang = buZhang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}