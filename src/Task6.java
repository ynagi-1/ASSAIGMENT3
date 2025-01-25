public class Task6 {
    public static void main(String[] args) throws Exception {
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
}