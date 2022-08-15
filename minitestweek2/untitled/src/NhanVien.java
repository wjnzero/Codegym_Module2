public abstract class NhanVien implements Comparable<NhanVien> {
    private String hoTen, email;
    private int maNV, tuoi, sdt;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String email, int maNV, int tuoi, int sdt) {
        this.hoTen = hoTen;
        this.email = email;
        this.maNV = maNV;
        this.tuoi = tuoi;
        this.sdt = sdt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "hoTen='" + hoTen + '\'' +
                ", email='" + email + '\'' +
                ", maNV=" + maNV +
                ", tuoi=" + tuoi +
                ", sdt=" + sdt +
                '}';
    }
    public abstract double thucLinh();
    @Override
    public int compareTo(NhanVien o) {
        int a = (int) (this.thucLinh() - o.thucLinh());
        return a;
    }
}
