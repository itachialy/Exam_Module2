package HoSoBenhAn;

import java.time.LocalDate;

public class BenhNhanThuong extends BenhAn{
    private int phiNamVien;
    public BenhNhanThuong(int STT, String code, String name,
                          LocalDate inDay, LocalDate outDay, String reason , int phiNamVien) {
        super(STT, code, name, inDay, outDay, reason);
        this.phiNamVien = phiNamVien;
    }

    public int getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" +
                super.toString() +
                "phiNamVien=" + phiNamVien +
                '}';
    }
    public String convertToLine(){
        return super.getSTT() + "," + super.getCode()+ "," + super.getName()+ "," +
                super.getInDay()+ "," + super.getOutDay()+ "," + super.getReason() + ","+ phiNamVien;
    }
}
