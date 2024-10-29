package praktikum10;
// Kelas Penjumlahan yang mengimplementasikan interface OperasiHitung
public class Penjumlahan implements OperasiHitung {
    @Override
    public int hitung(int a, int b) {
        return a + b;
    }
    
}