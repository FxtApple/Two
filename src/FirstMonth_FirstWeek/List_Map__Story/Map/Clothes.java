package FirstMonth_FirstWeek.List_Map__Story.Map;

public class Clothes {
    private int id;

    public int getId() {
        return id;
    }

    private String kind;
    private String color;
    private double price;
    private boolean summer;

    public void setID(int id) {
        this.id = id;
    }

    public void setMount(int mount) {
        this.id = mount;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSummer() {
        return summer;
    }

    public void setSummer(boolean summer) {
        this.summer = summer;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "mount=" + id +
                ", kind='" + kind + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", summer=" + summer +
                '}';
    }
}
