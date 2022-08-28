import sv.Student;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("In source file: ");
//        String sourcePath = in.nextLine();
//        System.out.print("Out destination file: ");
//        String destPath = in.nextLine();
//
//        File sourceFile = new File(sourcePath);
//        File destFile = new File(destPath);
//        try {
////            copyFileUsingJava7Files(sourceFile, destFile);
//            copyFileUsingStream(sourceFile, destFile);
//            System.out.print("Copy completed");
//        } catch (IOException ioe) {
//            System.out.print("Can't copy that file ");
//            System.out.printf(ioe.getMessage());
//        }
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "V? Ki?u Anh", "Hà N?i"));
        students.add(new Student(2, "Nguy?n Minh Quân", "Hà N?i"));
        students.add(new Student(3, "??ng Huy Hoà", "?à N?ng"));
        students.add(new Student(4, "Nguy?n Khánh Tùng", "Hà N?i"));
        students.add(new Student(5, "Nguy?n Kh?c Nh?t", "Hà N?i"));
        writeToFile("student.txt",students);

        List<Student> studentFromFile = readDataFromFile("student.txt");
        for (Student student:studentFromFile
             ) {
            System.out.println(student);
        }

    }
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        }
        finally {
            is.close();
            os.close();
        }
    }
    public static void writeToFile(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}