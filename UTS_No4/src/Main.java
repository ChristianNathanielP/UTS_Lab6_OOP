import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###############"); // Format output
        System.out.println("--< Menghitung Gaya Coloumb >--\n");

        System.out.println("Soal No1:");
        System.out.println("Diketahui: ");
        System.out.println("q1 = 5, q2 = 10, r = 3");
        System.out.println("Ditanya: Hitung Gaya Coloumb?");
        System.out.println("Gaya Coloumb untuk informasi diatas adalah : " + df.format(Coloumb.calculate(5, 10, 3)));

        System.out.println(" ");

        System.out.println("Soal No2:");
        System.out.println("Diketahui: ");
        System.out.println("q1 = 9, r = 6, F = 18.8");
        System.out.println("Ditanya: Carila q2?");
        System.out.println("Q2 untuk informasi diatas adalah : " + df.format(Coloumb.calculateQ2(9, 6, 18.8)));

        System.out.println(" ");

        System.out.println("Soal No1:");
        System.out.println("Diketahui: ");
        System.out.println("q1 = 9, q2 = 9, r = 10, Jika berada pada ruang vakum");
        System.out.println("Ditanya: Hitung Gaya Coloumb?");
        System.out.println("Gaya Coloumb untuk informasi diatas adalah : " + df.format(Coloumb.calculate(9, 19, 10, true)));
    }
}