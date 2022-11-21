package replit.collections;

import java.util.PriorityQueue;

public class Collection04 {
    //Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.
    //priority queue elemanları: sari,yesil,mavi,kirmizi

    //Beklenen Çıktı:

    //Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]

    public static void main(String[] args) {


        PriorityQueue<String>renkler=new PriorityQueue<>();
        renkler.add("kirmizi");
        renkler.add("mavi");
        renkler.add("sari");
        renkler.add("yesil");
        System.out.println(renkler);

        renkler.offer("pembe");
        System.out.println(renkler);
    }
}
