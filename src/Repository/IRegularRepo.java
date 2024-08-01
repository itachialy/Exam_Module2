package Repository;

import HoSoBenhAn.BenhNhanThuong;

import java.util.List;

public interface IRegularRepo {
    List<BenhNhanThuong> findAll();
    void save(BenhNhanThuong benhNhanThuong);
    void delete(int id);
    BenhNhanThuong findById(int STT);


}
