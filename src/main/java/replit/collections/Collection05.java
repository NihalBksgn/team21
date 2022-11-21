package replit.collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Collection05 {
    /*
    Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.
1. TreeSet: mavi,yesil,kirmizi,sari
2. TreeSet: yesil,mavi,pembe,turuncu
    Beklenen Çıktı:
            1. TreeSet: [kirmizi,mavi,sari,yesil]
            2. TreeSet: [mavi,pembe,turuncu,yesil
    Karsilastirma Sonucu:
    no
    yes
    no
    yes

     */
    public static void main(String[] args) {
        TreeSet<String> tree1 = new TreeSet<>(Set.of("kirmizi","mavi","sari","yesil"));
        TreeSet<String>tree2 = new TreeSet<>(Set.of("mavi","pembe","turuncu","yesil"));

        for (String w:tree1) {
            if(tree2.contains(w)){
                System.out.println("yes");
            }else
            System.out.println("no");
        }
    }
}
