public class Escseq {
    public static void main(String[] args) {
        for (int i = 7; i <= 100; i += 7) {
            if (i % 2 == 0) {
                System.out.println("\t" + i);
            } else {
                System.out.println(i);
            }
        }
    }
}