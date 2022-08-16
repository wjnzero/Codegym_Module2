package nextDay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("case 1/1/2022")
    void testDay1Month1Year2022(){
//        3A
//        Arrange: setup Du lieu (input, output)
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2022;
        String expected = "2/1/2022";
//        Action: thuc thi phuong thuc
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
//        Assert
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 31/1/2022")
    void testDay31Month1Year2022(){
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2022;

        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals("1/2/2022",result);
    }
    @Test
    @DisplayName("case 30/4/2022")
    void testDay30Month4Year2022(){
        int dayTest = 30;
        int monthTest = 4;
        int yearTest = 2022;

        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals("1/5/2022",result);
    }

    @Test
    @DisplayName("case 28/2/2018")
    void testDay28Month2Year2018(){
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2018;

        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals("1/3/2018",result);
    }
    @Test
    @DisplayName("case 29/2/2020")
    void testDay29Month2Year2020(){
        int dayTest = 29;
        int monthTest = 2;
        int yearTest = 2020;

        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals("1/3/2020",result);
    }

    @Test
    @DisplayName("case 31/12/2018")
    void testDay31Month12Year2018(){
        int dayTest = 31;
        int monthTest = 12;
        int yearTest = 2018;

        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals("1/1/2019",result);
    }

}