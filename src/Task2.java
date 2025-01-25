public class Task2 {
    public static void main(String[] args) {
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("The dog moves.");
        }

        @Override
        public void eat() {
            System.out.println("The dog eats.");
        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        @Override
        public void move() {
            System.out.println("The duck moves.");
        }

        @Override
        public void fly() {
            System.out.println("The duck flies.");
        }

        @Override
        public void eat() {
            System.out.println("The duck eats.");
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("The car moves.");
        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void move() {
            System.out.println("The airplane moves.");
        }

        @Override
        public void fly() {
            System.out.println("The airplane flies.");
        }
    }
}
