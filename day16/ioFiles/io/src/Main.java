import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        displayAndSumTextFiles();
//        ex url: D:\temp\concac.txt
//        displayAndMax();
        ReadWriteFileExample writeFileExample = new ReadWriteFileExample();
        writeFileExample.copyFiles("D:\\temp\\concactemp.txt","D:\\temp\\concac.txt");

    }

    private static void displayAndMax() {
        ReadWriteFileExample writeFileExample = new ReadWriteFileExample();
        List<Integer> list = writeFileExample.readFile("D:\\temp\\concac.txt");
        int max = ReadWriteFileExample.findMax(list);
        writeFileExample.writeFile("D:\\temp\\concac.txt",max);
    }

    private static void displayAndSumTextFiles() {
        System.out.print("input url files: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadWriteFileExample readFileExample = new ReadWriteFileExample();
        readFileExample.readFileTextNadSum(path);
    }
}