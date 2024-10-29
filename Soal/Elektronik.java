package Soal;
// Kelas Elektronik yang mengimplementasikan interface Pembayaran
public class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.10; 
    }
}