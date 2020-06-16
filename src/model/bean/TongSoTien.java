package model.bean;

public class TongSoTien {
    String makhachhang;
    String tenkhachhang;
    int TongTien;

    public TongSoTien(String makhachhang, String tenkhachhang, int tongTien) {
        this.makhachhang = makhachhang;
        this.tenkhachhang = tenkhachhang;
        TongTien = tongTien;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }
}
