package FirstMonth_FirstWeek.List_Map__Story.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LookXiangce {
    public static void main(String[] args)
    {
        Person p = new Person();
        p.setAge(69);
        p.setId(14232767);
        p.setJobName("jingcha");
        p.setMan(true);
        XiangCe xiangCe = new XiangCe();
        xiangCe.setCapacity(36);
        xiangCe.setLocation("书房");
        xiangCe.setNum(28);
        xiangCe.setOwner(p);

        List<Photo> photos = new ArrayList<Photo>();
        for (int i = 0; i < 10; i++) {
            Photo photo = new Photo();
            photo.setDate(new Date(1993,(2+i)%12,24));
            photo.setId(i);
            photo.setScenery(true);
            photo.setSize(57);
            photos.add(photo);
        }
        xiangCe.setPhotosList(photos);
        System.out.println(xiangCe);
    }
}
