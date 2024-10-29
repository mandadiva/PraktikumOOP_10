package Soal;
// Kelas Main 
public class Main {
    public static void main(String[] args) {
        // Objek Elektronik
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 10000.0; 
        double pajakElektronik = elektronik.hitungPajak(hargaElektronik);
        System.out.println("Pajak Elektronik (harga " + hargaElektronik + "): " + pajakElektronik);
        
        // Objek Makanan
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 5000.0;
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);
        System.out.println("Pajak Makanan (harga " + hargaMakanan + "): " + pajakMakanan);
    }
}
