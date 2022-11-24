package mentor_tasks.kitapprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static mentor_tasks.kitapprojesi.Menu.menu;


public class KitapPojo {

    static ArrayList<KitapPojo> kitaplik = new ArrayList<>();
    static List<KitapPojo> kitapListem = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    private int kitapNo;
    private String kitapAdi;
    private String yazarAdi;

    private double kitapFiyati;

    static int sayac=1000;

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

