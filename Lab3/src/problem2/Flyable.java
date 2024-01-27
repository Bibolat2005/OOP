package problem2;

public interface Flyable extends Moveable{
    void flyUp();
    void flyDown();
    boolean canFly();
}