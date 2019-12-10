package FirstMouth.SecondWeek.StudentUnion;

import java.io.*;
import java.util.Date;

public class Email {
    public String emailID;        //邮箱编号
    public Date date;
    public Student sendStudent;
    public String content;
    public String filePath;    //要发送邮件的路径
    //是否有未发送邮件
    public boolean isNotSendEmail = true;
    //是否有未接受邮件
    public boolean isNotReceiveEmail = true;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String geFilePath() {
        return filePath;
    }

    public void setFilePath(String readFilePath) {
        this.filePath = readFilePath;
    }

    //需要发送的邮件
    public Email(String emailID, String content,Date date) {
        this.emailID = emailID;
        this.content = content;
        date = new Date();
    }

    //需要接受的邮件
    public Email(String emailID, String filePath) {
        this.emailID = emailID;
        this.filePath = filePath;
    }

    public String sendEmail(String filePath,Email email) {
        String writePath = filePath;        //发到哪里
        File file = new File(writePath);
        String content = email.getContent();
        try {
            Writer writer = new OutputStreamWriter(new FileOutputStream(file));//多态
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePath;
    }

    public void receiveEmial(String readFilePath,String writeFilePath){
        File file = new File(readFilePath);
        char[] chars = new char[100];
        try {
            Reader is = new InputStreamReader(new FileInputStream(file));
            int temp = 0;
            int count = 0;
            while((temp = is.read())!=(-1)){
                chars[count++] = (char)temp;
                Writer writer = new OutputStreamWriter(new FileOutputStream(writeFilePath));//多态
                writer.write(new String(chars,0,count));
                writer.close();
            }
            }catch(Exception e){
                System.out.println();
            }
    }
}
