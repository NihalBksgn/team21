package replit.conditional;

import java.util.Scanner;

public class C01_YildakiAyinGunSayisi {
    /*
    1 ile 12 arasında girilen sayıdan ve yıldan  yılın hangi ayı olduğunun ve  o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.

Test Data:
2

2016

Beklenen çıktı:
2016 yili Subat ayi 29 gun

Test Data:
4

1998

Beklenen Çıktı:
1998 yili Nisan ayi 30 gun
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay numarasi giriniz");
        int ayNo = input.nextInt();
        System.out.println("Bir yil giriniz");
        int yil = input.nextInt();


            switch (ayNo) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(yil + " da " + ayNo + ". ayda gun sayisi 31'dir");
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(yil + "da" + ayNo + ". ayda gun sayisi 30dur");
                    break;
                case 2:
                    if ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0) {
                    System.out.println(yil + "da" + ayNo + ". ayda gun sayisi 29dur");
            } else {
                System.out.println(yil + "da" + ayNo + ". ayda gun sayisi 28dir");
            }
        }
    }
}