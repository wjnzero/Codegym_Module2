public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Fan speedFan = new Fan();
        Fan fan1 = new Fan(speedFan.MEDIUM, 10,"yellow",true);
        Fan fan2 = new Fan(speedFan.SLOW, 5,"blue",false);
        System.out.printf("%s", fan1);
        System.out.printf("\n%s", fan2);
    }
}