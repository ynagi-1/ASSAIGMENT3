public class Task5 {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Task5 building = new Task5();
        building.initialize("Restaurant");
        building.initialize("Barbershop");
    }
}
