package FirstMonth_FirstWeek.List_Map__Story.List;

import java.util.List;

public class XiangCe {
    /**
     * 谁的相册
     * */
    private Person owner;

    /***
     * 照片数量
     * */
    private int num;

    /**
     * 相册容量
     * */
    private Integer capacity;

    /**
     * 相册位置
     * */
    String location;

    /**
     * 照片
     * */
    List<Photo> photosList;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person person) {
        this.owner = person;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public List<Photo> getPhotosList() {
        return photosList;
    }

    public void setPhotosList(List<Photo> photosList) {
        this.photosList = photosList;
    }

    @Override
    public String toString() {
        return "XiangCe{" +
                "person=" + owner +
                ", num=" + num +
                ", capacity=" + capacity +
                ", location='" + location + '\'' +
                ", photosList=" + photosList +
                '}';
    }
}
