package controller;

import model.HoaDon;
import storage.SoSach;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    public static List<HoaDon> hoaDons = new ArrayList<>();
//public static List<HoaDon> hoaDons;

    static {
        try {
            hoaDons = SoSach.docSoSach();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
//            System.out.println("ối");
        }
    }
    public void themHoaDon(HoaDon hd){
        hoaDons.add(hd);
        SoSach.ghiSoSach(hoaDons);
    }
    public void suaHoaDon(HoaDon hd, int viTri){
        hoaDons.set(viTri,hd);
        SoSach.ghiSoSach(hoaDons);
    }
    public void xoaHoaDon(int viTri){
        hoaDons.remove(viTri);
        SoSach.ghiSoSach(hoaDons);
    }
}
