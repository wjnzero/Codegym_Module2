package tamGiacLaTacGiam;

public class TriangleClassifier {

    public static final String NOTTRIANGLE = "không phải là tam giác";
    public static final String ISOSCELESTRIANGLE = "tam giác cân";
    public static final String TRIANGLE = "tam giác thường";
    public static final String EQUILATERALTRIANGLE = "tam giác đều";

    public static String inPut(int a, int b, int c){
        if (checkTriangle(a,b,c)){
            if (a == b && b == c){
                return EQUILATERALTRIANGLE;
            }
            else if (a==b||b==c||a==c){
                return ISOSCELESTRIANGLE;
            }
            else {
                return TRIANGLE;
            }
        }
        else {
            return NOTTRIANGLE;
        }
    }
    public static boolean checkTriangle(int a, int b, int c){
        return a + b > c && b + c > a && a + c > b;
    }

}
