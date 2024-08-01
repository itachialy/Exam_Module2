package HoSoBenhAn;

import java.time.LocalDate;

public class BenhNhanVIP extends BenhAn{
    private String loaiVip;
    private int thoiHanVip;
    public BenhNhanVIP(int STT, String code, String name, LocalDate inDay, LocalDate outDay,
                       String reason, String loaiVip , int thoiHanVip) {
        super(STT, code, name, inDay, outDay, reason);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public int getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(int thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenhNhanVIP{" + super.toString() +
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHanVip=" + thoiHanVip +
                '}';
    }
    public String convertToLineVip(){
        return super.getSTT() + "," + super.getCode()+ "," + super.getName()+ "," +
                super.getInDay()+ "," + super.getOutDay()+ "," + super.getReason() +"," + loaiVip + "," + thoiHanVip;
    }
}
