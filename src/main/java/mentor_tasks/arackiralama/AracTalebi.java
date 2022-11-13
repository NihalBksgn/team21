package mentor_tasks.arackiralama;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AracTalebi {
    //Kiralama ile ilgili variableler
    private String alinacakGun;
    private String alinacakSehir;
    private LocalDateTime alisSaati;
    private LocalDateTime teslimSaati;

    //Arac ile ilgili bilgiler
    private String marka;
    private String model;
    private String yakitTipi;
    private String vitesTipi;
    private double gunlukUcret;

public AracTalebi (String alinacakGun,String alinacakSehir,LocalDateTime alisSaati,LocalDateTime teslimSaati){
    this.alinacakGun=alinacakGun;
    this.alinacakSehir=alinacakSehir;
    this.alisSaati=alisSaati;
    this.teslimSaati=teslimSaati;
}

    public AracTalebi(String marka, String model, String yakitTipi, String vitesTipi, double gunlukUcret) {
        this.marka = marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vitesTipi = vitesTipi;
        this.gunlukUcret = gunlukUcret;
    }

    public String getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(String alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public LocalDateTime getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(LocalDateTime alisSaati) {
        this.alisSaati = alisSaati;
    }

    public LocalDateTime getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(LocalDateTime teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVitesTipi() {
        return vitesTipi;
    }

    public void setVitesTipi(String vitesTipi) {
        this.vitesTipi = vitesTipi;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }
}//class
