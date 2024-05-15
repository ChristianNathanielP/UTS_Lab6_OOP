public class Main {
    public static void main(String[] args) {
        Tabungan akun1 = new Tabungan("101001", "Christian Nathaniel", 0);


        akun1.tabung(100000);
        akun1.tabung(50000,5200);

        akun1.display();

        System.out.println("");

        Transaksi akun2 = new Transaksi ("101002", "Nathaniel Christian", 0);
        akun2.tabung(100000);
        akun2.tabung(10000,2500);

        akun2.display();

    }
}