import java.util.Scanner;
/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk menampilkan teks berwarna
 */
public class SI_RegPagi22166017Latihan30Cakep {
   public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("\u001b[31mKamu \u001b[32mngerjain sendiri \u001b[33mlatihan 17 sampe \u001b[34mlatihan 30 ini? \u001b[0m");
        System.out.print("\u001b[34mJawab \u001b[31m(Yoi/Enggak) \u001b[0m: ");
        String jawab = input.next();
        
        if (jawab.equals("Yoi")) {
            System.out.println("\n\u001b[31mCakep Bener. \u001b[35mGood Job \u001b[0m");
        }else {
            System.out.println("""
                               \n\u001b[31mTetep cakep sih.
                               \u001b[36msing penting paham konsep nya yee.\u001b[0m""");
            System.out.println("Keep the code works dude");
        }
    }
}

