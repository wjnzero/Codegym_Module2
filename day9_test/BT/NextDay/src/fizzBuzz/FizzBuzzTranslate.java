package fizzBuzz;

public class FizzBuzzTranslate {
    static boolean numberCondition(int number){
        return number >= 0 && number <100;
    }
    static String translate(int number){
        String update = String.valueOf(number);
        if (numberCondition(number)){
            if (number % 15 == 0)
                return "FizzBuzz";
            else if (number% 3 == 0 || update.contains("3"))
                return "Fizz";
            else if (number % 5 ==0 || update.contains("5"))
                return "Buzz";
            else if (number<10) {
                return readNumber(number%10);
            }
            else return readNumber(number/10) + " " + readNumber(number%10);
        }
        else return "khong dem duoc";
    }
    static String readNumber(int number){
        String a;
        switch (number){
            case 1: a="mot";break;
            case 2: a="hai";break;
            case 3: a="ba";break;
            case 4: a="bon";break;
            case 5: a="nam";break;
            case 6: a="sau";break;
            case 7: a="bay";break;
            case 8: a="tam";break;
            case 9: a="chin";break;
            default: a="hung";
        }
        return a;
    }
}
