package FirstMonth_FirstWeek.List_Map__Story.List;

public class Person {
    /**
     * 性别
     * */
    private boolean isMan;

    /**
     * 身份ID
     * */
    private Integer id;

    /**
     *年龄
     * */
    private int age;

    /**
     * 工作名称
     * */
    private String jobName;

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "isMan=" + isMan +
                ", id=" + id +
                ", age=" + age +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
