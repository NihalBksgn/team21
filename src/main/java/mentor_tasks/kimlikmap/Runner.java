package mentor_tasks.kimlikmap;

import static mentor_tasks.kimlikmap.KimlikYap.person;
import static mentor_tasks.kimlikmap.KimlikYap.selectOption;

public class Runner {
    public static void main(String[] args) {

        person.put("2345", new Persons("Dilara", "Istanbul", "01721556"));
        person.put("4865", new Persons("Idil", "Canakkale", "01725684"));
        person.put("1545", new Persons("Azra", "Bursa", "1758965"));
        selectOption();



       String isim= person.get("Persons").tamIsim;
    }


}
