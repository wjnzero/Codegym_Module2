public class NhanVienFulltime extends NhanVien{
    private double tienThuong, tienPhat, luongCung;

    public NhanVienFulltime() {
    }

    public NhanVienFulltime(String hoTen, String email, int maNV, int tuoi, int sdt, double tienThuong, double tienPhat, double luongCung) {
        super(hoTen, email, maNV, tuoi, sdt);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double thucLinh(){
        return luongCung+(tienThuong-tienPhat);
    }
}
