import book.Book;
import book.FictionBook;
import book.ProgrammingBook;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("created by hug dep zai");

        Book buc1 = new ProgrammingBook("01", "c# cc", 500, "hung nguyen", "c#", ".net");
        Book buc2 = new ProgrammingBook("02", "PHP master", 5, "hung nguyen", "php", "cake");
        Book buc3 = new ProgrammingBook("03", "banana of java", 99, "hung nguyen", "java", "spring");
        Book buc4 = new ProgrammingBook("04", "beginner pascal ", 999, "hung nguyen", "pascal", "none");
        Book buc5 = new ProgrammingBook("05", "automotive with python ", 1, "hung nguyen", "python", "autoit");

        Book buc6 = new FictionBook("06", "SmokeWeedEveryday", 1000, "Snoop Dog", "horror");
        Book buc7 = new FictionBook("07", "BurnSchool", 50, "zero", "action");
        Book buc8 = new FictionBook("08", "Prison Break", 60, "TrQuanSu", "drama");
        Book buc9 = new FictionBook("09", "How to eat shit", 3, "phongNguyen", "horror");
        Book buc10 = new FictionBook("10", "How to get dick bigger", 5, "huyDuc", "horror");

        Book[] ds = {buc1, buc2, buc3, buc4, buc5, buc6, buc7, buc8, buc9, buc10};

        int priceAll = 0, count = 0, countHorror = 0, countPrice = 0;


        for (Book buc:ds
             ) {
            priceAll+=buc.getPrice();
        }

        for (Book buc:ds
             ) {
            if (buc instanceof ProgrammingBook){
                if (Objects.equals(((ProgrammingBook) buc).getLanguage(), "java")){
                    count++;
                }
            }
        }

        for (Book buc:ds
        ) {
            if (buc instanceof FictionBook){
                if (Objects.equals(((FictionBook) buc).getCategory(), "horror")){
                    countHorror++;
                }
            }
        }

        for (Book buc:ds
        ) {
            if (buc instanceof FictionBook){
                if (buc.getPrice() < 100){
                    countPrice++;
                }
            }
        }
        System.out.printf("price off all book: %d\ncount programing java book: %d\ncount fiction horror book: %d\ncount fiction book whose price less 100: %d",priceAll,count, countHorror, countPrice);






    }
}