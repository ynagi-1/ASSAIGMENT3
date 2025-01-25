public class Task11 {
    public static void main(String[] args) {
    }

    public interface Movable {
        void move();
    }

    public interface Edible {
        void beEaten();
    }

    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Eat, Edible {
        public void move() {
            System.out.println("Cat is moving");
        }

        public void eat() {
            System.out.println("Cat is eating someone");
        }

        public void beEaten() {
            System.out.println("Cat can be eaten");
        }
    }

    public class Dog implements Movable, Eat {
        public void move() {
            System.out.println("Dog is moving");
        }

        public void eat() {
            System.out.println("Dog is eating someone");
        }
    }

    public class Mouse implements Movable, Edible {
        public void move() {
            System.out.println("Mouse is moving");
        }

        public void beEaten() {
            System.out.println("Mouse can be eaten");
        }
    }
}
