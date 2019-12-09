package FirstMonth_FirstWeek.Company;

import java.util.ArrayList;
import java.util.List;

public class Deme {
    public static void main(String[] args){
        List<GongSiYuGongRelationShip> listGSYG = new ArrayList<>();
        GongSiYuGongRelationShip gsyg = new GongSiYuGongRelationShip();
        gsyg.setCompanyID(001);
        gsyg.setGsygID(001);
        gsyg.setYuanGongID(001);
        listGSYG.add(gsyg);
        GongSiYuGongRelationShip gsyg01 = listGSYG.get(0);
        System.out.println(gsyg);
    }

}
