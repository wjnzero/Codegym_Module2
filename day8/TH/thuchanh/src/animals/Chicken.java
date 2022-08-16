package animals;

import ediable.Ediable;

public class Chicken extends Animal{

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}