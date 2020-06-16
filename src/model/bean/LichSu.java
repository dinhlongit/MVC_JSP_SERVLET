package model.bean;

public class LichSu {
    String TenBenh;
    String MaVacXin;
    String tenvacxin;
    int somui;

    public LichSu(String tenBenh, String maVacXin, String tenvacxin, int somui) {
        TenBenh = tenBenh;
        MaVacXin = maVacXin;
        this.tenvacxin = tenvacxin;
        this.somui = somui;
    }

    public String getTenBenh() {
        return TenBenh;
    }

    public void setTenBenh(String tenBenh) {
        TenBenh = tenBenh;
    }

    public String getMaVacXin() {
        return MaVacXin;
    }

    public void setMaVacXin(String maVacXin) {
        MaVacXin = maVacXin;
    }

    public String getTenvacxin() {
        return tenvacxin;
    }

    public void setTenvacxin(String tenvacxin) {
        this.tenvacxin = tenvacxin;
    }

    public int getSomui() {
        return somui;
    }

    public void setSomui(int somui) {
        this.somui = somui;
    }
}
