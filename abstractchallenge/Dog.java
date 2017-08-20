package abstractchallenge;

/**
 * Created by mindwarrior on 12/9/2016.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breather in, breathe out, repeat");
    }
}

