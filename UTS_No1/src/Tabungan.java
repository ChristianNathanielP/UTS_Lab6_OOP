import java.util.ArrayList;

public class Tabungan {
    //    Variabel yang menyimpan informasi
    private String noAkun;
    private String namaAkun;
    private double saldoAkun;
    private ArrayList<Double> jumlahTransaksi;

    //    Ini Constructor
    public Tabungan(String noAkun, String namaAkun, double saldoAkun){
        this.noAkun = noAkun;
        this.namaAkun = namaAkun;
        this.saldoAkun = saldoAkun;
        this.jumlahTransaksi = new ArrayList<>();
    }
//    method untuk memasukan tabungan menggunakan overloading
    public void tabung(double nominal){
        saldoAkun += nominal;
        tambahTabungan(nominal);
    }
//    method yg sama namun memiliki parameter yang beda
    public void tabung(double nominal, double nominal_receh){
        double total = nominal + nominal_receh;
        saldoAkun += total;
        tambahTabungan(total);
    }
//method untuk menghitung tambah tabungan
    private void tambahTabungan(double jumlah){
        jumlahTransaksi.add(jumlah);
    }
//menampilkan data dan saldo setelah ditabung
    public void display(){
        System.out.println("Hello, Selamat Datang " + namaAkun);
        System.out.println("\nDATA PRIBADI ANDA: ");
        System.out.println("Nama Lengkap    : " + namaAkun);
        System.out.println("No Akun Anda    : " + noAkun);
        System.out.println("Saldo Anda      : Rp" + saldoAkun );
    }

//    Method Setter dan Getter
    public String getNoAkun(){
        return noAkun;
    }
    public void setNoAkun(){
        this.noAkun = noAkun;
    }

    public String getNamaAkun(){
        return namaAkun;
    }
    public void setNamaAkun(){
        this.namaAkun = namaAkun;
    }

    public double getSaldoAkun(){
        return saldoAkun;
    }

    public void setSaldoAkun(double saldoAkun) {
        this.saldoAkun = saldoAkun;
    }
    public ArrayList<Double> getJumlahTransaksi() {
        return jumlahTransaksi;
    }
}
