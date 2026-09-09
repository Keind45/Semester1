public class ContohOperator01 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ = " + x++); //evaluasi x dulu baru ditambah 1
        System.out.println("Setelah evaluasi, x = " + x);
        x = 10;
        System.out.println("++x = " + ++x); //ditambah 1 dulu baru dievaluasi
        System.out.println("Setelah evaluasi, x = " + x);
        int y = 12;
        System.out.println(x > y || y == x && y <= x); //false || false && false = false || false = false
        System.out.println(x > y || y == x & y <= x); //false ||
        int z = x ^ y; // operator bitwise XOR jika desimal maka dikonversi ke biner dulu baru dioperasikan, jika desimal sama maka hasilnya 0 jika berbeda maka hasilnya 1
        System.out.println("Hasil x ^ y = " + z);
        z %= 2;
        System.out.println("Hasil akhir " + z); //hasil sisanya
    }
}