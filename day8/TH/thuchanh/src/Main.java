import animals.Animal;
import animals.Chicken;
import animals.Tiger;
import comparable.CompareableCircle;
import ediable.Ediable;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Animal [] animals = new Animal[2];
//        animals[0] = new Tiger();
//        animals[1] = new Chicken();
//
//        for (Animal e: animals) {
//            System.out.println(e.makeSound());
//
//            if (e instanceof Animal) {
//                Ediable ediabler = (Animal) e;
//                System.out.println(ediabler.howToEat());
//            }
//        }

        Fruit fruit[] = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit e : fruit ) {
            System.out.println(e.howToEat());
        }

//        CompareableCircle[] circles = new CompareableCircle[3];
//        circles[0] = new CompareableCircle(3.6);
//        circles[1] = new CompareableCircle();
//        circles[2] = new CompareableCircle(3.5, "indigo", false);
//        System.out.println("Pre-sorted: ");
//        for (CompareableCircle circle:circles) {
//            System.out.println(circle);
//        }
//        Arrays.sort(circles);
//        System.out.println("After-sorted:");
//        for (CompareableCircle circle:circles){
//            System.out.println(circle);
//        }
    }
}