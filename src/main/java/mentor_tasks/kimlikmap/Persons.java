package mentor_tasks.kimlikmap;

public class Persons {
    public String tamIsim;
    public String adres;
    public String telefon;


    public Persons(String tamIsim, String adres, String telefon) {
        this.tamIsim = tamIsim;
        this.adres = adres;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Kullanici Bilgileri{" +
                "tamIsim='" + tamIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }

}
