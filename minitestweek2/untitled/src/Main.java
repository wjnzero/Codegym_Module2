import java.util.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
        NhanVien nv1 = new NhanVienFulltime("hug1", "hug1@gmail.com", 1, 24, 113, 50000, 5000, 100000);
        NhanVien nv2 = new NhanVienParttime("hug2", "hug2@gmail.com", 2, 24, 113, 8);
        NhanVien nv3 = new NhanVienFulltime("hug3", "hug3@gmail.com", 3, 24, 113, 500000, 50000, 10000000);
        NhanVien nv4 = new NhanVienParttime("hug4", "hug4@gmail.com", 4, 24, 113, 88);

        NhanVien[] dsNv= {nv1, nv2, nv3, nv4};

        System.out.println(tbLuongAll(dsNv));

        for (NhanVien nvNgu:NhanVienFullMaLuongThap(dsNv)
             ) {
            System.out.println(nvNgu);
        }

        System.out.println(tongLuongPart(dsNv));

        System.out.println("\nDanh sách lương của Fulltime tăng dần là:");
        Arrays.sort(dsNv);
        for (NhanVien e : dsNv
        ) {
            if (e instanceof NhanVienFulltime){
                System.out.println(e);
            }
        }




    }
    public static double tbLuongAll(NhanVien[] arr){
        double tongLuong = 0;
        for (NhanVien nv:arr
        ) {
            if (nv instanceof NhanVienFulltime){
                tongLuong+=((NhanVienFulltime) nv).thucLinh();
            }
            else {
                tongLuong+=((NhanVienParttime) nv).thucLinh();
            }

        }
        return tongLuong/arr.length;
    }
    public static List<NhanVien> NhanVienFullMaLuongThap(NhanVien[] arr){
        List<NhanVien> nvCuiBap = new ArrayList<>();
        for (NhanVien nv:arr
        ) {
            if (nv instanceof NhanVienFulltime){
                if (((NhanVienFulltime) nv).thucLinh() < tbLuongAll(arr)){
                    nvCuiBap.add(nv);
                }
            }
        }
        return nvCuiBap;
    }
    public static double tongLuongPart(NhanVien[] arr){
        double tongLuongPart = 0;
        for (NhanVien nv:arr
        ) {
            if (nv instanceof NhanVienParttime){
                tongLuongPart+=((NhanVienParttime) nv).thucLinh();
            }

        }
        return tongLuongPart;
    }

}