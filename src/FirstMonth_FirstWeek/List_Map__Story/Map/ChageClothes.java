package FirstMonth_FirstWeek.List_Map__Story.Map;

import java.util.HashMap;
import java.util.Map;

public class ChageClothes {
    public static void main(String[] args) {
        ClothesPress cp = new ClothesPress();
        cp.setHeight(88);
        cp.setLocation("chuangtou");
        cp.setMadeOff("棉布");
        cp.setSize(153);
        cp.setWeiht(65.6d);

        Map<String,Clothes> map = new HashMap<>();
        Clothes zaiku = new Clothes();
        zaiku.setID(1);
        zaiku.setKind("仔裤");
        zaiku.setColor("浅色");
        zaiku.setSummer(false);
        zaiku.setMount(1);
        zaiku.setPrice(100);
        map.put("仔裤",zaiku);

        Clothes lianyiqun = new Clothes();
        lianyiqun.setID(2);
        lianyiqun.setKind("连衣裙");
        lianyiqun.setColor("黑白格");
        lianyiqun.setSummer(true);
        lianyiqun.setMount(1);
        lianyiqun.setPrice(121);
        map.put("连衣裙",lianyiqun);
        cp.setMap(map);
        System.out.println(cp);
    }

}
