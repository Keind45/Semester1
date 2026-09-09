public class Tugas01No3 {
    public static void main(String[] args) {
        double lebar = 30;
        double panjang = 100;
        double diameter = 5;
        double sisi = 2;

        double luasTanah = lebar * panjang;

        double jariJari = diameter / 2;
        double luasKolam = Math.PI * jariJari * jariJari;

        double luasTaman = sisi * sisi;

        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas Tanah          : " + luasTanah + " m2");
        System.out.println("Luas Kolam          : " + luasKolam + " m2");
        System.out.println("Luas Taman          : " + luasTaman + " m2");
        System.out.println("Luas Tidak Digunakan: " + luasTidakDigunakan + " m2");
    }
}