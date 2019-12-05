package FirstMonth_FirstWeek.List_Map__Story.Map;

import java.util.HashMap;
import java.util.Map;

public class ClothesPress {
    private int size;
    private String madeOff;
    private String location;
    private double weiht;
    private int height;
    Map<String,Clothes> map = new HashMap<>();

    public Map<String, Clothes> getMap() {
        return map;
    }

    public void setMap(Map<String, Clothes> map) {
        this.map = map;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMadeOff() {
        return madeOff;
    }

    public void setMadeOff(String madeOff) {
        this.madeOff = madeOff;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWeiht() {
        return weiht;
    }

    public void setWeiht(double weiht) {
        this.weiht = weiht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "ClothesPress{" +
                "size=" + size +
                ", madeOff='" + madeOff + '\'' +
                ", location='" + location + '\'' +
                ", weiht=" + weiht +
                ", height=" + height +
                ", map=" + map +
                '}';
    }
}
