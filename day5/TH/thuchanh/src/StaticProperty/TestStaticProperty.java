package StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Ca ca1  =new Ca("toy", "ac quy");
        System.out.println(Ca.numberOfCa);
        Ca ca2  =new Ca("vin", "bolt");
        System.out.println(Ca.numberOfCa);
    }
}
