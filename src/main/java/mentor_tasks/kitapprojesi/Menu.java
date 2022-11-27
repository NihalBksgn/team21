package mentor_tasks.kitapprojesi;


import java.util.*;

import static mentor_tasks.kitapprojesi.KitapPojo.*;


public class Menu {

    public static final String kirmizi = "\u001B[31m";

    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";


    public static void kutuphaneyeGiris() {

        System.out.println(kirmizi + "       TEAM 21 KUTUPHANE'YE HOSGELDINIZ      ");

        HashMap<String, Integer> kullanicilar = new HashMap<>();
        boolean flag = true;
        do {
            kullanicilar.put("Sevim", 1234);
            kullanicilar.put("Faruk", 2345);
            kullanicilar.put("Hatice", 3456);
            kullanicilar.put("Muhammet", 4567);
            kullanicilar.put("Kubra", 5678);
            kullanicilar.put("Ali", 6789);
            kullanicilar.put("Esra", 9876);
            kullanicilar.put("Hava", 8765);
            kullanicilar.put("Nihal", 7654);

            System.out.println(mor + "Kullanici adinizi giriniz");
            String kullaniciIsmi = input.next();
            input.nextLine();

            try {

                System.out.println(mor + "Kutuphaneye giris sifrenizi giriniz");
                int sifre = input.nextInt();
                input.nextLine();

                int counter = 0;
                for (Map.Entry<String, Integer> w : kullanicilar.entrySet()) {

                    if (w.getKey().equalsIgnoreCase(kullaniciIsmi) && w.getValue().equals(sifre)) {
                        menu();
                    } else {
                        counter++;
                    }
                }
                if (counter == kullanicilar.size()) {
                    System.out.println(kirmizi + "Yanlis Kullanici Adi veya Sifre Girdiniz");
                }


            } catch (Exception e) {
                System.out.println("Yanlis karakter girdiniz! Lutfen sadece rakam giriniz veya Q ya basip cikabilirsiniz");

                String exit = input.next();
                if (exit.equalsIgnoreCase("q")) {
                    flag = false;
                }
            }

        } while (flag);
    }


    //BASLANGICTA GORMEK ISTEDIGIM MENU
    public static void menu() {

        try {

            System.out.println(mor + "Yapmak istediginiz islemi seciniz:\n");
            System.out.println(sari + "1-Kitap Ekle\n" +
                    "2-Numara ile Kitap Goruntule\n" +
                    "3-Bilgi ile Kitap Goruntule\n" +
                    "4-Numara ile Kitap Sil\n" +
                    "5-Tum Kitaplari Listele\n" +
                    "6-Cikis");
            int secim = input.nextInt();
            //  input.nextLine();
            switch (secim) {
                case 1:
                    kitapEkle();
                    menu();
                    break;
                case 2:
                    numaraIleKitap();
                    menu();
                    break;
                case 3:
                    bilgiIleKitap();
                    menu();
                    break;
                case 4:
                    numaraIleSil();
                    menu();
                    break;
                case 5:
                    kitapListele();
                    menu();
                case 6:
                    cikis();
                    break;
                default:
                    System.out.println(kirmizi + "yanlis giris yaptiniz. Tekrar deneyiniz");
                    menu();
            }

        } catch (InputMismatchException e) {
            System.out.println(kirmizi + "Secimler icin 1-6 arasi rakam girmelisiniz,harf giremezsiniz.\n" +
                    "Devam etmek icin D\nCikmak isterseniz Q'ya basiniz");
            input.nextLine();
            String scm = input.next();
            if (scm.equalsIgnoreCase("d")) {
                menu();
            } else if (scm.equalsIgnoreCase("q")) {
                cikis();
            }
        }

    }

    //KITAP EKLEME
    public static void kitapEkle() {


        System.out.println(mor + "Kaydetmek istediginiz kitabin adini giriniz..");
        input.nextLine();
        String kitapIsmi = input.nextLine();


        System.out.println(mor + "Kaydetmek istediginiz kitabin Yazar adini giriniz..");
        String yazarIsmi = input.nextLine();

        try {
            System.out.println(mor + "Kaydedilecek kitabin fiyatini giriniz...");
            double fiyat = Math.abs(input.nextDouble());

            KitapPojo kitap1 = new KitapPojo(sayac, kitapIsmi, yazarIsmi, fiyat);
            kitaplik.add(kitap1);

            System.out.println(sari + "Kitap Ekleme Isleminiz Basariyla Gerceklestirilmistir!");
            System.out.println();
            kitapListele();

            menu();

        } catch (InputMismatchException e) {
            System.out.println(kirmizi + "Fiyat harf olarak girilemez!\n");

            kitapEkle();
        }


    }
    //NUMARA ILE KITAP GORUNTULEME

    public static void numaraIleKitap() {

        System.out.println(mor + "Goruntulemek istedgigniz kitabin numarasini giriniz");
        int kitapNumarasi = input.nextInt();

        int counter = 0;
        for (KitapPojo w : kitaplik) {
            if (w.getKitapNo() == kitapNumarasi) {
                System.out.println(mavi + "Kitap No: " + mor + w.getKitapNo() + "\n" +
                        mavi + "Kitap Adi: " + mor + w.getKitapAdi() + "\n" +
                        mavi + "Yazar Adi: " + mor + w.getYazarAdi() + "\n" +
                        mavi + "Kitap Fiyati: " + mor + moneyFormat.format(w.getKitapFiyati()));
                System.out.println(kirmizi + "Yukarida " + w.getKitapNo() + " numarali kitabi goruntulediniz");
                System.out.println();
                menu();
            } else {
                counter++;
            }
        }
        if (counter == kitaplik.size()) {
            System.out.println(kirmizi + "gecersiz kitap numarasi girdiniz.\n" +
                    "cikmak icin 1\n" +
                    "yeni bir kitap numarasi girmek icin 2'yi seciniz");
            try {
                int secim = input.nextInt();
                if (secim == 1) {
                    cikis();
                } else if (secim == 2) {
                    numaraIleKitap();
                } else {
                    System.out.println("Gecersiz bir secim yaptiniz");

                }
            } catch (Exception e) {
                System.out.println("Yanlis karakter girdiniz.Devam etmek icin lutfen sadece rakam giriniz.Cikmak isterseniz Q'ya basiniz");
                input.nextLine();
                String exit = input.next();
                if (exit.equalsIgnoreCase("q")) {
                    cikis();

                }
            }
        }
    }
    //  BILGI ILE KITAP GORUNTULEME

    public static void bilgiIleKitap() {
        Scanner input = new Scanner(System.in);
        System.out.println(sari + "Kitap ismi ile arama yapmak istiyorsaniz 0 \n Yazar ismi ile arama yapmak istiyorsaniz 1 \n Kitap fiyatiyla arama yapmak istiyorsaniz 2 " +
                "\n menuye donmek icin 3'e tiklayiniz");
        int secim = input.nextInt();
        input.nextLine();
        switch (secim) {


            case 0:
                System.out.println(mor + "Lutfen kitap ismini giriniz..");
                String kitapIsmi = input.nextLine();
                int counter = 0;
                for (KitapPojo w : kitaplik) {

//                    if (w.getKitapAdi().equalsIgnoreCase(kitapIsmi)) {
//                        System.out.println(mavi + "Kitap No: " + mor + w.getKitapNo() + "\n" +
//                                mavi + "Kitap Adi: " + mor + w.getKitapAdi() + "\n" +
//                                mavi + "Yazar Adi: " + mor + w.getYazarAdi() + "\n" +
//                                mavi + "Kitap Fiyati: " + mor + moneyFormat.format(w.getKitapFiyati()));
//                    } else {
//                        counter++;
//
//                    }
//                }
//                if (counter == kitaplik.size()) {
//                    System.out.println(kirmizi + "Aradiginiz kitap kutuphanemizde bulunmamaktadir");
//                    bilgiIleKitap();
//                }
                    if (w.getKitapAdi().equalsIgnoreCase(kitapIsmi)) {
                        bilgiIleKitap.add(w);

                    }
                }
                System.out.println(bilgiIleKitap);

                if (bilgiIleKitap.isEmpty()) {
                    System.out.println(kirmizi + "Aradiginiz kitap kütüphanemizde yoktur");
                }

                bilgiIleKitap.clear();
                bilgiIleKitap();
                break;

            case 1:
                System.out.println(mor + "Lütfen yazarin adini giriniz");
                String yazarAdi = input.nextLine();
                input.nextLine();
                int sayac = 0;
                for (KitapPojo w : kitaplik) {
                    if (w.getYazarAdi().equalsIgnoreCase(yazarAdi)) {
                        System.out.println(kirmizi + w.getYazarAdi() + "'nin Kitaplari: ");
                        System.out.println(mavi + "Kitap No: " + mor + w.getKitapNo() + "\n" +
                                mavi + "Kitap Adi: " + mor + w.getKitapAdi() + "\n" +
                                mavi + "Yazar Adi: " + mor + w.getYazarAdi() + "\n" +
                                mavi + "Kitap Fiyati: " + mor + moneyFormat.format(w.getKitapFiyati()));
                        bilgiIleKitap();
                    } else {
                        sayac++;
                    }
                }
                if (sayac == kitaplik.size()) {
                    System.out.println(kirmizi + "Girdiginiz yazara ait kitap yoktur");
                    bilgiIleKitap();
                }

                break;

            case 2:
                System.out.println(mor + "Almak istediginiz kitap fiyat araligini giriniz");
                double fiyat1 = input.nextDouble();
                double fiyat2 = input.nextDouble();

                double min = Math.min(fiyat1, fiyat2);
                double max = Math.max(fiyat1, fiyat2);
                int counter1 = 0;

                System.out.println(kirmizi + min + "-" + max + " € arasindaki kitaplar: ");
                for (KitapPojo w : kitaplik) {


                    if (w.getKitapFiyati() < max && w.getKitapFiyati() > min) {

                        System.out.println(mavi + "Kitap No: " + mor + w.getKitapNo() + "\n" +
                                mavi + "Kitap Adi: " + mor + w.getKitapAdi() + "\n" +
                                mavi + "Yazar Adi: " + mor + w.getYazarAdi() + "\n" +
                                mavi + "Kitap Fiyati: " + mor + moneyFormat.format(w.getKitapFiyati()));
                    } else {
                        counter1++;
                    }
                }
                if (counter1 == kitaplik.size()) {
                    System.out.println(kirmizi + "Aradiginiz fiyat araliginda kitap yoktur");
                    bilgiIleKitap();
                }

                break;
            case 3:
                menu();
                break;

            default:
                System.out.println(kirmizi + "Gecersiz bir giris yaptiniz.Lutfen tekrar deneyiniz");
                bilgiIleKitap();

        }
    }
    //NUMARA ILE KITAP SIL

    public static void numaraIleSil() {
        System.out.println(mor + "Silmek istediginiz kitabin numarasini giriniz");
        int number = input.nextInt();
        int counter2 = 0;
        for (KitapPojo w : kitaplik) {
            if (w.getKitapNo() == number) {
                System.out.println(kirmizi + w.getKitapAdi() + " isimli kitabi silmek istediginize emin misiniz?\n" +
                        "E/H");
                String scm = input.next();
                if (scm.equalsIgnoreCase("h")) {
                    numaraIleSil();
                } else if (scm.equalsIgnoreCase("e")) {
                    kitaplik.remove(w);
                    System.out.println(sari + "Silme isleminiz basariyla gerceklestirilmistir");
                }

            } else {
                counter2++;
            }
        }
        if (counter2 == kitaplik.size()) {
            System.out.println(kirmizi + "Silmek istediginiz kitap numarasi listede bulunmamaktadir\n");
            menu();
        }
    }
    //TUM KITAPLARI LISTELE

    public static void kitapListele() {
        System.out.println(kirmizi + "KITAP LISTESI");

        for (KitapPojo w : kitaplik) {
            System.out.println(mavi + "Kitap No: " + mor + w.getKitapNo() + "\n" +
                    mavi + "Kitap Adi: " + mor + w.getKitapAdi() + "\n" +
                    mavi + "Yazar Adi: " + mor + w.getYazarAdi() + "\n" +
                    mavi + "Kitap Fiyati: " + mor + w.getKitapFiyati());
            System.out.println();
        }
    }

    //CIKIS METODU
    public static void cikis() {
        System.out.println(kirmizi + "Cikmak istediginize emin misiniz?\n" +
                "Evet ise E'ye,\n" +
                "Menuye donmek icin M'ye basiniz");
        String secim = input.next();
        if (secim.equalsIgnoreCase("E")) {
            System.out.println(sari + "Cikis isleminiz basariyla gerceklestirilmistir");
            kutuphaneyeGiris();
        } else if (secim.equalsIgnoreCase("M")) {
            menu();
        } else {
            System.out.println(kirmizi + "Lutfen gecerli bir secim yapiniz");
            cikis();
        }
    }

}
