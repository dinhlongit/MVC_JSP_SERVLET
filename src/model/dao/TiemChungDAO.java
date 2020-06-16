package model.dao;

import model.bean.KhachHang;
import model.bean.LichSu;
import model.bean.TongSoTien;
import model.bean.VacXin;

import java.sql.*;
import java.util.ArrayList;

public class TiemChungDAO {
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;

    public Connection getConnectionMySql() {
        String hostName = "localhost";
        String dbName = "thiltm";
        String userName = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connURL = "jdbc:mysql://" + hostName + ":3306/" + dbName
                    + "?serverTimezone=EST5EDT";
            conn = (Connection) DriverManager.getConnection(connURL,userName,password);
            System.out.println("Connect success !");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        } catch (SQLException e) {
            System.out.println("Error connect!");
        }
        return conn;
    }


    public boolean addNewVacXin(VacXin vx){
        boolean status = false;
        conn = this.getConnectionMySql();

        try{
            String sql = "INSERT INTO vacxin (mavacxin,tenvacxin,somui,mota,giavacxin,tenhang) VALUES(?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,vx.getId());
            ps.setString(2,vx.getTenVacXin());
            ps.setInt(3,vx.getSoMui());
            ps.setString(4,vx.getMoTa());
            ps.setInt(5,vx.getGiaVacXin());
            ps.setString(6,vx.getTenHang());

            return status = (ps.executeUpdate()==1)?true:false;

        }catch (Exception e){
            e.printStackTrace();
        }

           return status;
    }

    public boolean deleteVacXinById(String id){
        boolean status = false;
        conn = this.getConnectionMySql();

        try{
            String sql = "DELETE FROM vacxin WHERE mavacxin=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,id);
            return status = (ps.executeUpdate()==1)?true:false;
        }catch (Exception e){
            e.printStackTrace();
        }

        return status;
    }




   public boolean editVacXinById(VacXin vx){
        boolean status = false;
        conn = this.getConnectionMySql();

        try{
            String sql = "UPDATE vacxin SET tenvacxin=?,somui=?,mota=?,giavacxin=?,tenhang=? WHERE mavacxin=?";
            ps = conn.prepareStatement(sql);

            ps.setString(1,vx.getTenVacXin());
            ps.setInt(2,vx.getSoMui());
            ps.setString(3,vx.getMoTa());
            ps.setInt(4,vx.getGiaVacXin());
            ps.setString(5,vx.getTenHang());
            ps.setString(6,vx.getId());

            return status = (ps.executeUpdate()==1)?true:false;

        }catch (Exception e){
            e.printStackTrace();
        }

        return status;

    }

//SELECT benh.TenBenh,lichsutiemphong.MaVacXin,vacxin.tenvacxin, vacxin.somui FROM lichsutiemphong INNER JOIN vacxin ON vacxin.mavacxin = lichsutiemphong.MaVacXin INNER JOIN phongbenh ON phongbenh.MaVacXin = vacxin.mavacxin INNER JOIN benh on benh.MaBenh = phongbenh.MaBenh WHERE makhachhang="kh1"
    public ArrayList<LichSu> getLichSuTiemPhongById(String id){
        ArrayList<LichSu> listLichSu = new ArrayList<>();
        conn = this.getConnectionMySql();
        try{
            String sql = "SELECT benh.TenBenh,lichsutiemphong.MaVacXin,vacxin.tenvacxin, vacxin.somui FROM lichsutiemphong INNER JOIN vacxin ON vacxin.mavacxin = lichsutiemphong.MaVacXin INNER JOIN phongbenh ON phongbenh.MaVacXin = vacxin.mavacxin INNER JOIN benh on benh.MaBenh = phongbenh.MaBenh WHERE makhachhang=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,id);
            rs = ps.executeQuery();
            while (rs.next()){
                String TenBenh = rs.getString(1);
                String MaVacXin = rs.getString(2);
                String tenvacxin = rs.getString(3);
                int somui = rs.getInt(4);
                String somuiStr = String.valueOf(somui);

                LichSu lichSu = new LichSu(TenBenh,MaVacXin,tenvacxin,somui);
                listLichSu.add(lichSu);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
return listLichSu;
    }


    public ArrayList<KhachHang> getListKhachHang() {
        ArrayList<KhachHang> listKH = new ArrayList<>();

        conn = this.getConnectionMySql();

        try{
            String sql = "SELECT * FROM khachhang";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()){
                String makhachhang = rs.getString(1);
                String tenkhachhang = rs.getString(2);

                KhachHang kh = new KhachHang(makhachhang,tenkhachhang);
                listKH.add(kh);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return listKH;


    }

    public ArrayList<TongSoTien> getTongChiPhi() {
        ArrayList<TongSoTien> tongChiPhi = new ArrayList<>();

        conn = this.getConnectionMySql();

        try {
            String sql = "SELECT MaKhachHang,HoTenKH, Sum(GiaVacXin) as TongChiPhi FROM lichsutiemphong INNER JOIN vacxin ON vacxin.mavacxin = lichsutiemphong.MaVacXin INNER JOIN khachhang ON khachhang.MaKH = lichsutiemphong.MaKhachHang GROUP BY MaKhachHang";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
             String makh = rs.getString(1);
             String tenkh = rs.getString(2);
             int tien = rs.getInt(3);
              TongSoTien tongSoTien = new TongSoTien(makh,tenkh,tien);
              tongChiPhi.add(tongSoTien);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    return tongChiPhi;
    }


    public ArrayList<VacXin> getListVacXin(){
        ArrayList<VacXin> vacXinArrayList = new ArrayList<>();

        conn = this.getConnectionMySql();

        try{
            String sql = "SELECT * FROM vacxin";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()){
                String mavaxin = rs.getString(1);
                String tenvacxin = rs.getString(2);
                int somui = rs.getInt(3);
                String mota =rs.getString(4);
                int giavacxin = rs.getInt(5);
                String tenhang = rs.getString(6);
                VacXin vacXin = new VacXin(mavaxin,tenvacxin,somui,mota,giavacxin,tenhang);
                vacXinArrayList.add(vacXin);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return vacXinArrayList;
    }

    public VacXin getVacXinById(String mavacxin){
        VacXin vacXin = null;
        conn = this.getConnectionMySql();

        try{
            String sql = "SELECT * FROM vacxin WHERE mavacxin=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,mavacxin);
            rs = ps.executeQuery();
            while (rs.next()){
                String mavaxin = rs.getString(1);
                String tenvacxin = rs.getString(2);
                int somui = rs.getInt(3);
                String mota =rs.getString(4);
                int giavacxin = rs.getInt(5);
                String tenhang = rs.getString(6);
                 vacXin = new VacXin(mavaxin,tenvacxin,somui,mota,giavacxin,tenhang);

            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return vacXin;
    }


//    SELECT * FROM vacxin WHERE TenVacXin LIKE 'V%'

    public ArrayList<VacXin> getListSearch(String name){
        ArrayList<VacXin> vacXinArrayList = new ArrayList<>();

        conn = this.getConnectionMySql();

        try{
            String sql = "SELECT * FROM vacxin WHERE TenVacXin LIKE '%' ? '%'";

            ps = conn.prepareStatement(sql);
           ps.setString(1,name);
            rs = ps.executeQuery();

            while (rs.next()){
                String mavaxin = rs.getString(1);
                String tenvacxin = rs.getString(2);
                int somui = rs.getInt(3);
                String mota =rs.getString(4);
                int giavacxin = rs.getInt(5);
                String tenhang = rs.getString(6);
                VacXin vacXin = new VacXin(mavaxin,tenvacxin,somui,mota,giavacxin,tenhang);
                vacXinArrayList.add(vacXin);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return vacXinArrayList;
    }


    public static void main(String[] args) {

        TiemChungDAO dao = new TiemChungDAO();
        ArrayList<VacXin> vx = dao.getListSearch("Viem");
        for (int i = 0 ; i < vx.size() ; i++){
            System.out.println(vx.get(i).getTenVacXin());

        }

    }


}
