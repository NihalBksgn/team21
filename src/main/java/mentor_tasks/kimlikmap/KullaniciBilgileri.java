package mentor_tasks.kimlikmap;

public class KullaniciBilgileri {
    private String tamIsim;
    private String adres;
    private String telefon;

    public String getTamIsim() {
        return tamIsim;
    }

    public void setTamIsim(String tamIsim) {
        this.tamIsim = tamIsim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public KullaniciBilgileri(String tamIsim, String adres, String telefon) {
        this.tamIsim = tamIsim;
        this.adres = adres;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "KullaniciBilgileri{" +
                "tamIsim='" + tamIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }

}
