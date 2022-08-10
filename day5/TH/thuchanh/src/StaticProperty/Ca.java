package StaticProperty;

public class Ca {
    private String name;
    private String engine;

    public static int numberOfCa;

    public Ca(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCa++;
    }
}
