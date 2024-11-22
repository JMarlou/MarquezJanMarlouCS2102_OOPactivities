package Artists;
public class Dancer extends Artist {
    public enum DanceStyle { BALLET, HIPHOP, JAZZ, CONTEMPORARY }
    private DanceStyle danceStyle;

    public Dancer(String name, int age, String speciality, DanceStyle danceStyle) {
        super(name, age, speciality);
        this.danceStyle = danceStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dancer Info: ");
        super.displayInfo();
        System.out.println("Dance Style: " + danceStyle);
    }
}
