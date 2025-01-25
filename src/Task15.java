public class Task15 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {
        @Override
        public void onSelect() {
            System.out.println("Screen selected");
        }

        @Override
        public void refresh() {
            System.out.println("Screen refreshed");
        }
    }
}
