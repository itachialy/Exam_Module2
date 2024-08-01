package HoSoBenhAn;

import java.time.LocalDate;

public class BenhAn {
    private int STT;
    private String code;
    private String name;
    private LocalDate inDay;
    private LocalDate outDay;
    private String reason;

    public BenhAn(int STT, String code, String name, LocalDate inDay, LocalDate outDay, String reason) {
        this.STT = STT;
        this.code = code;
        this.name = name;
        this.inDay = inDay;
        this.outDay = outDay;
        this.reason = reason;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getInDay() {
        return inDay;
    }

    public void setInDay(LocalDate inDay) {
        this.inDay = inDay;
    }

    public LocalDate getOutDay() {
        return outDay;
    }

    public void setOutDay(LocalDate outDay) {
        this.outDay = outDay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "STT=" + STT +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", inDay=" + inDay +
                ", outDay=" + outDay +
                ", reason='" + reason + '\'' +
                ',';
    }
}
