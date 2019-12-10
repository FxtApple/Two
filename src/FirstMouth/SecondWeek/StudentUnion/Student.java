package FirstMouth.SecondWeek.StudentUnion;

import java.io.*;

public class Student {
    public int sendStudentID;         //学生ID
    public String sendEmailID;        //发件人邮箱编号
    public String receiveEmailID;     //接受人邮箱编号
    public String writeFilePath;      //发送人邮件地址
    public String readFilePath;       //接收人邮件地址
    public boolean isNotSendEmail;    //是否有未发送邮件
    public boolean isNotReceiveEmail; //是否有未接受邮件

    //可作为发送邮件的学生
    public Student(int sendStudentID, String receiveEmailID,Email email) {
        this.sendStudentID = sendStudentID;        //发件学生ID
        this.receiveEmailID = receiveEmailID;      //发到谁的邮箱地址
    }

    public Student(String receiveEmailID, String writeFilePath) {
        this.receiveEmailID = receiveEmailID;
        this.writeFilePath = writeFilePath;
    }
}













