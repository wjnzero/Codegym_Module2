package model;

import java.io.Serializable;
import java.time.LocalDate;

public class KhachTro implements Serializable {
    private String hoVaTen;
    private int cmnd;
    private int namSinh;

    public KhachTro() {
    }

    public KhachTro(String hoVaTen, int cmnd, int namSinh) {
        this.hoVaTen = hoVaTen;
        this.cmnd = cmnd;
        this.namSinh = namSinh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "KhachTro{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
}
