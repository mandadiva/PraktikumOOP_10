package praktikum10;
// Kelas Pengurangan yang mengimplementasikan interface OperasiHitung
public class Pengurangan implements OperasiHitung {
    @Override
    public int hitung(int a, int b) {
        return a - b;
    }
}