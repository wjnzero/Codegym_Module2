import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileExample {
    public void readFileTextNadSum(String path){
        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            bufferedReader.close();

            System.out.println("sum = "+sum);

        }
        catch (Exception e){
            System.err.println("files does not exists or unknown error");
        }
    }
    public List<Integer> readFile(String path){
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line=reader.readLine())!=null){
                list.add(Integer.parseInt(line));
            }
            reader.close();
        }
        catch (Exception e){
//            System.err.println("files does not exists or unknown error");
            System.out.println(e);
        }
        return list;
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter reader = new BufferedWriter(writer);
            reader.write("\nMax is "+max);
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> list){
        int max = list.get(0);
        for (Integer integer : list) {
            if (max < integer) {
                max = integer;
            }
        }
        return max;
    }

    public void copyFiles(String url1, String url2){
        try {
            File file1 = new File(url1);
            File file2 = new File(url2);
//            if (file1.exists()){
//                throw new FileNotFoundException("file1 does not exists");
//            }
//            if (!file2.exists()){
//                throw new FileNotFoundException("file2 does not exists");
//            }

            BufferedInputStream in = new BufferedInputStream(Files.newInputStream(file1.toPath()));
            BufferedOutputStream out = new BufferedOutputStream(Files.newOutputStream(file2.toPath()));
            int length;
            byte[] buffer = new byte[1024];
            while ((length = in.read(buffer)) > 0){
                out.write(buffer,0,length);
            }
            in.close();
            out.close();
            System.out.println("done");
        }
        catch (Exception e){
            System.err.println("files does not exists or unknown error");
        }
    }
}
