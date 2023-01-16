import java.util.Scanner;

public class BiletMain {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double perKm = 10.0, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();

        if (yolculukTipi > 2) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        if (yas < 12) {
            total = perKm * mesafe * 0.5;
            System.out.println("Yolcuya%50 indirim uygulandı. Bilet fiyatı: " + total);
        } else if (yas >= 12 && yas < 24) {
            total = perKm * mesafe * 0.9;
            System.out.println("Yolcuya %10 indirim uygulandı. Bilet fiyatı: " + total);
        } else if (yas >= 24 && yas < 65) {
            total = perKm * mesafe;
            System.out.println("Bilet fiyatı: " + total);
        } else {
            total = perKm * mesafe * 0.7;
            System.out.println("Yolcuya %30 indirim uygulandı. Bilet fiyatı: " + total);
        }

        if (yolculukTipi == 2) {
            total = total * 0.8;
            System.out.println("Gidiş-dönüş indirimi uygulandı Toplam Tutar= " + total);
        } else {
            System.out.println("Toplam Tutar: " + total);

        }
    }
}
