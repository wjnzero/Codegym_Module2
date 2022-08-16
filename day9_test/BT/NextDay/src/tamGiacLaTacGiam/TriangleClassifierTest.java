package tamGiacLaTacGiam;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    @DisplayName("222")
    void testCase222(){
//        3A
//        Arrange: setup Du lieu (input, output)
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giác đều";
//        Action: thuc thi phuong thuc
        String result = TriangleClassifier.inPut(a,b,c);
//        Assert
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("223")
    void testCase223(){
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giác cân";
        String result = TriangleClassifier.inPut(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("345")
    void testCase345(){
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giác thường";
        String result = TriangleClassifier.inPut(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("823")
    void testCase823(){
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.inPut(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("-1 2 1")
    void testCaseNegative_1_21(){
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.inPut(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("0 2 1")
    void testCase021(){
        int a = 0;
        int b = 2;
        int c = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.inPut(a,b,c);
        assertEquals(expected,result);
    }
}
