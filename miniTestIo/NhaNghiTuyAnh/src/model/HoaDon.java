package model;

import java.io.Serializable;

public class HoaDon extends KhachTro implements Serializable,ThanhToan {
    private int soNgayTro, giaPhong;
    private String loaiPhong;
//    private KhachTro khachTro;

//    public HoaDon() {
//    }
//
//    public HoaDon(int soNgayTro, String loaiPhong, int giaPhong, KhachTro khachTro) {
//        this.soNgayTro = soNgayTro;
//        this.loaiPhong = loaiPhong;
//        this.giaPhong = giaPhong;
//        this.khachTro = khachTro;
//    }

//    @Override
//    public String toString() {
//        return "HoaDon{" +
//                "soNgayTro=" + soNgayTro +
//                ", loaiPhong=" + loaiPhong +
//                ", giaPhong=" + giaPhong +
//                ", khachTro=" + khachTro +
//                '}'+"\n";
//    }


    public HoaDon(String hoVaTen, int cmnd, int namSinh, int soNgayTro, int giaPhong, String loaiPhong) {
        super(hoVaTen, cmnd, namSinh);
        this.soNgayTro = soNgayTro;
        this.giaPhong = giaPhong;
        this.loaiPhong = loaiPhong;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "soNgayTro=" + soNgayTro +
                ", giaPhong=" + giaPhong +
                ", loaiPhong='" + loaiPhong + '\'' +
                "ho ten =" + getHoVaTen() +
                "cmt =" + getCmnd() +
                "nam sinh =" + getNamSinh() +
                '}'+"\n";
    }

    @Override
    public double tinhTien() {
        return soNgayTro*giaPhong;
    }
}
