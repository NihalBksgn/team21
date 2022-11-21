package replit.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection02 {
    //Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.
    public static void main(String[] args) {

        List<String> renkler = new ArrayList<>(Arrays.asList("siyah","mavi","kirmizi","beyaz"));

        renkler.add(0,"pembe");
        renkler.add(3,"yesil");
        System.out.println(renkler);

    }
}
