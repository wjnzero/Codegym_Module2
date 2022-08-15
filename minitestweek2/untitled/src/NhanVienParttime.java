public class NhanVienParttime extends NhanVien{
    private int soGioLamViec;

    public NhanVienParttime() {
    }

    public NhanVienParttime(String hoTen, String email, int maNV, int tuoi, int sdt, int soGioLamViec) {
        super(hoTen, email, maNV, tuoi, sdt);
        this.soGioLamViec = soGioLamViec;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }
    public double thucLinh(){
        return soGioLamViec*100000;
    }
}
