package animals;

import ediable.Ediable;

public class Tiger extends Animal{

    @Override
    public String makeSound() {
        return "Tiger: co sung day ne!";
    }

    @Override
    public String howToEat() {
        return "Cant eat";
    }
}
