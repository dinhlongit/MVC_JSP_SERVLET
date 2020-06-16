package model.bo;

import model.bean.KhachHang;
import model.bean.LichSu;
import model.bean.TongSoTien;
import model.bean.VacXin;
import model.dao.TiemChungDAO;

import java.util.ArrayList;

public class TiemChungBO {
      TiemChungDAO tiemChungDAO = new TiemChungDAO();

      public boolean addNewVacXin(VacXin vx){
          return tiemChungDAO.addNewVacXin(vx);
      }
    public boolean editVacXin(VacXin vx){
        return tiemChungDAO.editVacXinById(vx);
    }

    public ArrayList<VacXin> getListVacXin(){
        return tiemChungDAO.getListVacXin();
    }

    public VacXin getVacXin(String id){
        return tiemChungDAO.getVacXinById(id);
    }


    public ArrayList<KhachHang> getListKhachHang() {

        return tiemChungDAO.getListKhachHang();

    }

    public ArrayList<LichSu> getLichSuTiemPhongById(String id) {

        return tiemChungDAO.getLichSuTiemPhongById(id);

    }

    public ArrayList<TongSoTien> getTongChiPhi( ) {

        return tiemChungDAO.getTongChiPhi();

    }

    public boolean deleteVacXinById(String id){
        return tiemChungDAO.deleteVacXinById(id);
    }
    public ArrayList<VacXin> getListSearch(String name){
          return tiemChungDAO.getListSearch(name);
    }



}
