package FirstMonth_FirstWeek.Company;

import java.util.Date;

public class Company {
    public int companyID;
    public Date date;
    public boolean isShangShi;
    public String location;
    public int yuanGongMount;
    public boolean isGuoQi;

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isShangShi() {
        return isShangShi;
    }

    public void setShangShi(boolean shangShi) {
        isShangShi = shangShi;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYuanGongMount() {
        return yuanGongMount;
    }

    public void setYuanGongMount(int yuanGongMount) {
        this.yuanGongMount = yuanGongMount;
    }

    public boolean isGuoQi() {
        return isGuoQi;
    }

    public void setGuoQi(boolean guoQi) {
        isGuoQi = guoQi;
    }
}
