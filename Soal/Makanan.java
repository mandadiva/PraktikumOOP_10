package Soal;
// Kelas Makanan yang mengimplementasikan interface Pembayaran    
public class Makanan implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.05;
    }
}