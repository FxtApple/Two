package FirstMouth.SecondWeek.StudentUnion;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Email email = new Email("0000001","下午打球去不",new Date());
        Student buZhang = new Student(00101,"1427829542",email);
        String readFilePath =  email.sendEmail("C:\\Users\\dell\\Desktop\\b.txt",email);
        Department department = new Department();
        department.setName("青自部");
        department.setDepartmentID(001);
        department.setBuZhang(buZhang);

        Student buZhang2 = new Student("1783587395@qq.com","C:\\Users\\dell\\Desktop\\c.txt");
        String filePath = buZhang2.getWriteFilePath();
        Email receiveEmail = new Email("0000001",filePath);
        receiveEmail.receiveEmial(readFilePath,filePath);
        Department department2 = new Department();
        department2.setName("体育部");
        department2.setDepartmentID(002);
        department2.setBuZhang(buZhang2);

    }
}
