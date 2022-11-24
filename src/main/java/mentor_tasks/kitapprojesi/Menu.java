package mentor_tasks.kitapprojesi;

import java.util.*;

import static mentor_tasks.kitapprojesi.KitapPojo.*;

public class Menu {
             //BASLANGICTA GORMEK ISTEDIGIM MENU
    public static void menu() {
        System.out.println("Yapmak istediginiz islemi seciniz:\n1-Kitap Ekle\n" +
                "2-Numara ile Kitap Goruntule\n" +
                "3-Bilgi ile Kitap Goruntule\n" +
                "4-Numara ile Kitap Sil\n" +
                "5-Tum Kitaplari Listele\n" +
                "6-Cikis");

        int secim = input.nextInt();
        switch (secim) {
            case 1:
                kitapEkle();
                menu();
                break;
            case 2:
                // numaraIleKitap();
                menu();
                break;
            case 3:
                // bilgiIleKitap();
                menu();
                break;
            case 4:
                // numaraIleSil();
                menu();
                break;
            case 5:
                //  kitapListele();
                menu();
            case 6:
                // cikis();
                break;
            default:
                System.out.println("yanlis giris yaptiniz. Tekrar deneyiniz");
                menu();
                break;
        }
    }


                            //KITAP EKLEME
    public static void kitapEkle() {

        System.out.println("Kaydetmek istediginiz kitabin adini giriniz");
        String kitapAdi = input.nextLine();
        System.out.println("Kaydetmek istediginiz kitabin yazar adini giriniz");
        String yazarAdi = input.nextLine();
        System.out.print("Kaydedilecek kitabin fiyatini giriniz");
        double fiyat = Double.parseDouble(input.nextLine());

        KitapPojo kitap1 = new KitapPojo(sayac,kitapAdi, yazarAdi, fiyat);

        kitaplik.add(kitap1);

        System.out.println(kitaplik);
        sayac++;
        System.out.println("\nKitap ekleme isleminiz basariyla tamamlanmistir.\n" +
                "Yeni kitap eklemek istiyorsaniz 1'e , \n" +
                "Menuye dönmek icin 2'ye\n" +
                "Cikis yapmak icin baska herhangi bir tusa basiniz");
        int secim = Integer.parseInt(input.nextLine());
        if (secim == 1) {
            kitapEkle();
        } else if (secim == 2) {
            menu();
        } else {
            // cikis();
        }
    }
                                 //NUMARA ILE KITAP GORUNTULEME

    public static void numaraIleKitap(){

        System.out.println("Goruntulemek istedgigniz kitabin numarasini giriniz");
        int kitapNumarasi = input.nextInt();

        if (kitapNumarasi<1000){
            System.out.println("gecersiz kitapno");
            numaraIleKitap();
        }else {
            for (KitapPojo w : kitaplik){
                if (w.getKitapNo()==kitapNumarasi){
                    System.out.println(w);
                }

            }
        }

    }


                                     //  BILGI ILE KITAP EKLEME

    public static void bilgiIleKitap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kitap ismi ile arama yapmak istiyorsaniz 1 \n Yazar ismi ile arama yapmak istiyorsaniz 2 \n Kitap fiyatiyla arama yapmak istiyorsaniz 3'ü seciniz " +
                "\n menuye donmek icin herhangi bir harfe tiklayiniz");
        int secim = Integer.parseInt(input.nextLine());

        switch (secim) {

            case 1:
                System.out.println("Lutfen kitap ismini giriniz..");
                String kitapIsmi = input.nextLine();

                for (KitapPojo w : kitaplik) {

                    if (w.getKitapAdi().equalsIgnoreCase(kitapIsmi)) {
                        kitapListem.add(w);
                        System.out.println(kitapListem);
                    }
                }
                if (kitapListem.size()==0){
                System.out.println("Aradiginiz kitap kütüphanemiyde yok");
            }
                kitapListem.clear();
                bilgiIleKitap();
                break;

            case 2:
                System.out.println("Lütfen yazarin adini giriniz");
                String yazarAdi = input.nextLine();

                for (KitapPojo w : kitaplik) {
                    if (w.getYazarAdi().equalsIgnoreCase(yazarAdi)) {
                        kitapListem.add(w);
                        System.out.println(kitapListem);
                    }
                }
                if (kitapListem.size()==0){
                    System.out.println("Girdiginiz yazara ait kitap yoktur");
                }
                kitapListem.clear();
                bilgiIleKitap();
                break;

            case 3:
                System.out.println("Almak istediginiz kitap fiyat araligini giriniz");
                double fiyat = Double.parseDouble(input.nextLine());
                for (KitapPojo w : kitaplik) {

                    if (w.getKitapFiyati()==fiyat) {


                        kitapListem.add(w);
                        System.out.println(kitapListem);
                    }
                }
                if (kitapListem.size()==0){
                System.out.println("Aradiginiz fiyatta kitap yoktur");
            }
                kitapListem.clear();
                bilgiIleKitap();
                break;

            default:
                menu();
        }
    }

                    //NUMARA ILE KITAP SIL
}
