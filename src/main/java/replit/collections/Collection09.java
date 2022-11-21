package replit.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection09 {

   /* HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
    HashSet List: sari,mavi,kirmizi,yesil,mor

    Beklenen Çıktı:

    TreeSet elements:

    kirmizi
    mavi
    mor
    sari
    yesil

    */
   public static void main(String[] args) {

       HashSet<String> renkler=new HashSet<>(Set.of("sari","mavi","kirmizi","yesil","mor"));
       TreeSet<String> tree = new TreeSet<>(renkler);
       System.out.println(tree);
   }
}
