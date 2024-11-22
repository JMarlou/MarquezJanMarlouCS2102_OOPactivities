public class Artist {
    protected String name;
    protected int age;
    protected String speciality;

    public Artist(String name, int age, String speciality) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
    }

    public void displayInfo() {
        System.out.println("Artist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Speciality: " + speciality);
    }
}
