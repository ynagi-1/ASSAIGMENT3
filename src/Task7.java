public class Task7 {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());
    }

    public interface Drinker {
        void askForMore(String message);
        void sayThankYou();
        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;
        void sleepOnTheFloor();
    }

    public interface Selectable {
        void onSelect();
    }

    public interface Updatable {
        void refresh();
    }

    public interface Desire {
    }

    public interface Dream {
        Hobby HOBBY = new Hobby();
    }

    public static class BeerLover implements Alcoholic {
        @Override
        public void askForMore(String message) {
        }

        @Override
        public void sayThankYou() {
        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {
        }
    }

    public static class Screen implements Selectable, Updatable {
        @Override
        public void onSelect() {
        }

        @Override
        public void refresh() {
        }
    }

    public static class Hobby implements Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
