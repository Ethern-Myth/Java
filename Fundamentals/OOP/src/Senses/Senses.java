package Senses;

public interface Senses {
    void See();

    void Hear();

    void Talk();

    void Smell();

    default void Live() {
        System.out.println("Human live");
    }
}
