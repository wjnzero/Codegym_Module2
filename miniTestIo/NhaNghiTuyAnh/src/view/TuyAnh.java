package view;

import controller.QuanLy;
import model.HoaDon;
import model.KhachTro;
import storage.SoSach;
//import storage.SoSach;

import java.util.List;
import java.util.Scanner;

public class TuyAnh {

    public static List<HoaDon> hoaDons = QuanLy.hoaDons;



    public static HoaDon taoHoaDon(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten khach: ");
        String tenKhach = scanner.nextLine();
        System.out.print("Nhap so CMND: ");
        int cmt = scanner.nextInt();
        System.out.print("Nhap nam sinh: ");
        int namSinh = scanner.nextInt();
        KhachTro khachTro = new KhachTro(tenKhach,cmt,namSinh);
        System.out.print("Nhap so ngay tro: ");
        int ngayTro = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap loai phong: ");
        String loaiPhong = scanner.nextLine();
        System.out.print("Nhap gia phong: ");
        int gia = scanner.nextInt();
        HoaDon hd = new HoaDon(tenKhach, cmt, namSinh, ngayTro,gia,loaiPhong);
        return hd;
    }


    public static void main(String[] args) {
        QuanLy hug = new QuanLy();
//        hug.themHoaDon(taoHoaDon());
//        hoaDons.add(taoHoaDon());
//        SoSach.ghiSoSach(hoaDons);
        System.out.println(hoaDons);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cmd:");
        int cmdIn = scanner.nextInt();
        for (HoaDon hd:hoaDons
             ) {
            int cmd = hd.getCmnd();
            if (cmdIn==cmd){
                System.out.println(hd.tinhTien());
                break;
            }
        }
    }
}
