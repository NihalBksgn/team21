package mentor_tasks.arackiralama;

public class AracTalep {
    //kiralama ile ilgili bilgiler
    private String alinacakSehir;
    private String alinacakGun;
    private String teslimGunu;
    private double alisSaati;
    private double teslimSaati;
    //arac ile ilgili bilgiler
    private String model;
    private String marka;
    private String yakitTuru;
    private String vites;
    private int gunlukKira;
    public AracTalep() {
    }
    public AracTalep(String alinacakSehir, String alinacakGun, String teslimGunu, double alisSaati, double teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;
        this.teslimGunu = teslimGunu;
        this.alisSaati = alisSaati;
        this.teslimSaati = teslimSaati;
    }
    public AracTalep(String marka,String model, String yakitTuru, String vites, int gunlukKira) {
        this.model=model;
        this.marka = marka;
        this.yakitTuru = yakitTuru;
        this.vites = vites;
        this.gunlukKira = gunlukKira;
    }
    @Override
    public String toString() {
        return "AracTalep{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukKira=" + gunlukKira +
                '}';
    }
    public String getAlinacakSehir() {
        return alinacakSehir;
    }
    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }
    public String getAlinacakGun() {return alinacakGun;}
    public void setAlinacakGun(String alinacakGun) {
        this.alinacakGun = alinacakGun;
    }
    public String getTeslimGunu() {
        return teslimGunu;
    }
    public void setTeslimGunu(String teslimGunu) {
        this.teslimGunu = teslimGunu;
    }
    public double getAlisSaati() {
        return alisSaati;
    }
    public void setAlisSaati(double alisSaati) {
        this.alisSaati = alisSaati;
    }
    public double getTeslimSaati() {
        return teslimSaati;
    }
    public void setTeslimSaati(double teslimSaati) {
        this.teslimSaati = teslimSaati;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getYakitTuru() {
        return yakitTuru;
    }
    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }
    public String getVites() {
        return vites;
    }
    public void setVites(String vites) {
        this.vites = vites;
    }
    public int getGunlukKira() {
        return gunlukKira;
    }
    public void setGunlukKira(int gunlukKira) {
        this.gunlukKira = gunlukKira;
    }
}