package Service;

import HoSoBenhAn.BenhNhanThuong;
import Repository.IRegularRepo;
import Repository.RegularRepoImpl;

import java.util.List;

public class RegularServiceImpl implements IRegularService{
    IRegularRepo iRegularRepo = new RegularRepoImpl();
    @Override
    public List<BenhNhanThuong> findAll() {
        return iRegularRepo.findAll();
    }

    @Override
    public void save(BenhNhanThuong benhNhanThuong) {
        iRegularRepo.save(benhNhanThuong);

    }

    @Override
    public void delete(int STT) {
        iRegularRepo.delete(STT);
    }

    @Override
    public BenhNhanThuong findById(int STT) {
        return iRegularRepo.findById(STT);
    }
}
