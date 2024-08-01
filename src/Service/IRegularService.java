package Service;

import HoSoBenhAn.BenhNhanThuong;

import java.util.List;

public interface IRegularService {
    List<BenhNhanThuong> findAll();
    void save(BenhNhanThuong benhNhanThuong);
    void delete(int STT);
    BenhNhanThuong findById(int STT);
}
