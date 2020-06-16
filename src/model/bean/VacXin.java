package model.bean;

public class VacXin {

    String id;
    String tenVacXin;
    int soMui;
    String moTa;
    int giaVacXin;
    String tenHang;

    public VacXin(String id, String tenVacXin, int soMui, String moTa, int giaVacXin, String tenHang) {
        this.id = id;
        this.tenVacXin = tenVacXin;
        this.soMui = soMui;
        this.moTa = moTa;
        this.giaVacXin = giaVacXin;
        this.tenHang = tenHang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenVacXin() {
        return tenVacXin;
    }

    public void setTenVacXin(String tenVacXin) {
        this.tenVacXin = tenVacXin;
    }

    public int getSoMui() {
        return soMui;
    }

    public void setSoMui(int soMui) {
        this.soMui = soMui;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGiaVacXin() {
        return giaVacXin;
    }

    public void setGiaVacXin(int giaVacXin) {
        this.giaVacXin = giaVacXin;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
}
