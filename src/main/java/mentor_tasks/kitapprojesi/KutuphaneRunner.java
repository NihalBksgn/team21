package mentor_tasks.kitapprojesi;

import static mentor_tasks.kitapprojesi.KitapPojo.kitaplik;
import static mentor_tasks.kitapprojesi.KitapPojo.sayac;
import static mentor_tasks.kitapprojesi.Menu.menu;

public class KutuphaneRunner extends Menu{

    public KutuphaneRunner(int kitapNo, String kitapAdi, String yazarAdi, double kitapFiyati) {
        super(kitapNo, kitapAdi, yazarAdi, kitapFiyati);
    }

    public static void main(String[] args){

        kutuphaneyeGiris();
    }
}
