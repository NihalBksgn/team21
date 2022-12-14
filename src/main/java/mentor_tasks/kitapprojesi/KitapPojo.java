package mentor_tasks.kitapprojesi;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class KitapPojo {

    public static final String kirmizi = "\u001B[31m";

    public static final String yesil = "\u001B[32m";

    public static final String sari = "\u001B[33m";

    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    static ArrayList<KitapPojo> kitaplik = new ArrayList<>();
    static List<KitapPojo> bilgiIleKitap = new ArrayList<>();
    static HashMap<String, Integer> kullanicilar = new HashMap<>();

    static Scanner input = new Scanner(System.in);

    static DecimalFormat moneyFormat = new DecimalFormat("###,##0.00'€'");
    private String kullanici;
    private int sifre;
    private int kitapNo;
    private String kitapAdi;
    private String yazarAdi;

    private double kitapFiyati;

    static int sayac = 1000;


    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public double getKitapFiyati() {
        return kitapFiyati;
    }

    public void setKitapFiyati(double kitapFiyati) {
        this.kitapFiyati = kitapFiyati;
    }

    public KitapPojo(int kitapNo, String kitapAdi, String yazarAdi, double kitapFiyati) {

        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyati = kitapFiyati;
        sayac++;
    }

    @Override
    public String toString() {
        return "KitapPojo{" +
                "kitapNo=" + kitapNo +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", kitapFiyati=" + kitapFiyati +
                '}';
    }


}

