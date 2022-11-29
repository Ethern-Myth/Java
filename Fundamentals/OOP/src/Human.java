import Senses.Senses;

public class Human implements Senses {
    public Human() {

    }

    @Override
    public void See() {
        System.out.println("Human can see objects and almost everything");
    }

    @Override
    public void Hear() {
        System.out.println("Human can hear sound");

    }

    @Override
    public void Talk() {
        System.out.println("Human can talk a language");

    }

    @Override
    public void Smell() {
        System.out.println("Human can smell odour");

    }

}
