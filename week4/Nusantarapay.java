import java.util.Scanner;

public class Nusantarapay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String statusAkun;
        double nominal;
        double saldo;
        boolean isBedaNegara;
        int jam;
        String statusAkhir;

        System.out.print("Status akun: ");
        statusAkun = sc.nextLine();

        System.out.print("Nominal transaksi: ");
        nominal = sc.nextDouble();

        System.out.print("Saldo: ");
        saldo = sc.nextDouble();

        System.out.print("Transaksi beda negara (true/false): ");
        isBedaNegara = sc.nextBoolean();

        System.out.print("Jam transaksi (0-23): ");
        jam = sc.nextInt();

        if (statusAkun.equals("BLACK-LISTED")) {
            statusAkhir = "REJECTED_BLACKLIST";
        } else if (nominal > saldo) {
            statusAkhir = "REJECTED_SALDO";
        } else if (nominal > 10000) {
            statusAkhir = "REJECTED_LIMIT";
        } else if (isBedaNegara && nominal > 2000) {
            statusAkhir = "FLAGGED_FRAUD";
        } else if (jam >= 0 && jam < 4 && nominal > 1000) {
            statusAkhir = "REQUIRE_OTP_NIGHT";
        } else if (statusAkun.equals("SUSPICIOUS") && nominal > 500) {
            statusAkhir = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            statusAkhir = "APPROVED";
        }

        System.out.println("Status transaksi: " + statusAkhir);
    }
}