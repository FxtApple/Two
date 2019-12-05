package FirstMonth_FirstWeek.List_Map__Story.List;

import java.util.Date;

public class Photo {

    /**
     * 照片id
     * */
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isScenery() {
        return scenery;
    }

    public void setScenery(boolean scenery) {
        this.scenery = scenery;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public boolean isMutiColour() {
        return mutiColour;
    }

    public void setMutiColour(boolean mutiColour) {
        this.mutiColour = mutiColour;
    }

    /**
     * 拍摄时间
     * */
    private Date date;

    /**
     * 人物照还是风景照
     * */
    private boolean scenery;

     /**
     * 照片尺寸
     * */
    private Integer size;

    /**
     * 彩色的吗
     * */
    private boolean mutiColour;

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", date=" + date +
                ", scenery=" + scenery +
                ", size=" + size +
                ", mutiColour=" + mutiColour +
                '}';
    }
}
