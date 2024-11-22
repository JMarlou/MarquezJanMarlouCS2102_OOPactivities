package Artists;
import Artists.Dancer.DanceStyle;
import Artists.Painter.Medium;
import Artists.Singer.Genre;
import Artists.Writer.WritingStyle;

public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        Singer singer = new Singer("Naeyeon Im", 29, "Music", Singer.Genre.POP);
        Painter painter = new Painter("Vincent van Gogh", 37, "Painting", Painter.Medium.OIL);
        Writer writer = new Writer("J.K. Rowling", 58, "Writing", Writer.WritingStyle.FICTION);
        Dancer dancer = new Dancer("Lee Chaeyeon", 24, "Dancing", Dancer.DanceStyle.HIPHOP);

        artist.displayInfo();
        System.out.println(' ');
        singer.displayInfo();
        System.out.println(' ');
        painter.displayInfo();
        System.out.println(' ');
        writer.displayInfo();
        System.out.println(' ');
        dancer.displayInfo();
    }
}
