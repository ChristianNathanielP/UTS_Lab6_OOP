import java.util.Arrays;

public class anagramCheck {

    public static boolean isAnagram(String kata1, String kata2){
//        Mengubah kata menjadi lowercase agar kedua kata memiliki tipe yg sama
        kata1 = kata1.toLowerCase();
        kata2 = kata2.toLowerCase();

//      Jika panjang kata berbeda, otomatis false
        if (kata1.length() != kata2.length() ){
            return false;
        }
//      Mengubah kedua kata menjadi Array dgn tipe data Char
        char[] charArray1 = kata1.toCharArray();
        char[] charArray2 = kata2.toCharArray();
//      Mengurutkan Array masing - masing kata
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

//      Nilai balikan boolean
        return Arrays.equals(charArray1, charArray2);
        /*
        Array yang berisi kata setelah diurutkan,
        Kemudian masing - masing akan dibandingkan apakah memiliki char yg sama
         */


    }
//    Menampilkan Hasil dari Perbandingan isAnagram
    public static void displayAnagram(String kata1, String kata2){
        boolean result = anagramCheck.isAnagram(kata1, kata2);
        System.out.println(kata1 + " dan " + kata2 + " apakah anagram : " + result);
    }
}
