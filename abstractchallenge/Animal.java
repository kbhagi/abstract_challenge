package abstractchallenge;

/**
 * Created by mindwarrior on 12/9/2016.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name=name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
