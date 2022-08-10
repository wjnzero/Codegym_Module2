package StaticMethod;

public class Student {
    private final int rollNo;
    private final String name;
    private static String college = "nothing";
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    static void change(){
        college = "cotGim";
    }

    void display(){
        System.out.printf("rollNo = %d name = %s college = %s\n",rollNo, name, college);
    }
}
