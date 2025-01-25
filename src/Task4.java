public class Task4 {
    public static void main(String[] args) {
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public abstract class Human implements CanRun, CanSwim {
    }
}
