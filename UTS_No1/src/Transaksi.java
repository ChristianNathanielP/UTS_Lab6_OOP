public class Transaksi extends Tabungan {

    public Transaksi(String noAkun, String namaAkun, double saldoAkun) {
        super(noAkun, namaAkun, saldoAkun);
    }
//  Menampilkan saldo dan transaksi yang terjadi, menggunakan override
    @Override
    public void display() {
        super.display();
        System.out.println("Daftar Transaksi: ");
        for (double transaksi : super.getJumlahTransaksi()) { //mengakses getter
            System.out.println("Transaksi: Rp" + transaksi);
        }
    }

    @Override
    public void tabung(double nominal) {
        super.tabung(nominal);
    }

    @Override
    public void tabung(double nominal, double nominal_receh) {
        super.tabung(nominal, nominal_receh);
    }

    private void tambahTransaksi(double jumlah) {
        getJumlahTransaksi().add(jumlah);
    }
}
