package Artists;
public class Painter extends Artist {
    public enum Medium { OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL }
    private Medium medium;

    public Painter(String name, int age, String speciality, Medium medium) {
        super(name, age, speciality);
        this.medium = medium;
    }

    @Override
    public void displayInfo() {
        System.out.println("Painter Info: ");
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
