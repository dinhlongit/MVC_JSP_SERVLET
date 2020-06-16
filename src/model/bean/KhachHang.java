package model.bean;

import java.sql.Date;

public class KhachHang {
    String MaKH;
    String HoTenKH;

    public KhachHang(String maKH, String hoTenKH) {
        MaKH = maKH;
        HoTenKH = hoTenKH;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getHoTenKH() {
        return HoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        HoTenKH = hoTenKH;
    }
}
