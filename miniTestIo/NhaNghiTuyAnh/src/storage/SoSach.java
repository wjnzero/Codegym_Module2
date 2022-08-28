package storage;

import model.HoaDon;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SoSach {
    public static List<HoaDon> docSoSach() throws IOException, ClassNotFoundException {
        List<HoaDon> hoaDons = new ArrayList<>();
        FileInputStream fis = new FileInputStream("SoSach.dll");
        ObjectInputStream ois = new ObjectInputStream(fis);
        hoaDons = (List<HoaDon>) ois.readObject();
        return hoaDons;
    }
    public static void ghiSoSach(List<HoaDon> hoaDons){
        try {
            FileOutputStream fos = new FileOutputStream("SoSach.dll");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hoaDons);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
