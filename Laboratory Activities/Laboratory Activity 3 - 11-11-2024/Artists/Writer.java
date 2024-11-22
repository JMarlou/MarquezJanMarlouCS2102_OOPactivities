package Artists;
public class Writer extends Artist {
    public enum WritingStyle { FICTION, NON_FICTION, POETRY, DRAMA }
    private WritingStyle writingStyle;

    public Writer(String name, int age, String speciality, WritingStyle writingStyle) {
        super(name, age, speciality);
        this.writingStyle = writingStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Writer Info: ");
        super.displayInfo();
        System.out.println("Writing Style: " + writingStyle);
    }
}
