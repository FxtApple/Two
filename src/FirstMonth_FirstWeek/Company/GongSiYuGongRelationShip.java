package FirstMonth_FirstWeek.Company;

public class GongSiYuGongRelationShip {
    public int gsygID;
    public int companyID;
    public int yuanGongID;

    public int getGsygID() {
        return gsygID;
    }

    public void setGsygID(int id) {
        this.gsygID = id;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getYuanGongID() {
        return yuanGongID;
    }

    public void setYuanGongID(int yuanGongIDS) {
        this.yuanGongID = yuanGongIDS;
    }

    @Override
    public String toString() {
        return "GongSiYuGongRelationShip{" +
                "gsygID=" + gsygID +
                ", companyID=" + companyID +
                ", yuanGongID=" + yuanGongID +
                '}';
    }
}
