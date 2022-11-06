package day_01;

public class Day01_wrapperClasses {

    public static void main(String[] args) {


      //Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
      //bulmak için bir kod yazınız.

       byte min=Byte.MIN_VALUE;
       short max=Short.MAX_VALUE;

       int toplam=min+max;
        System.out.println("toplam = " + toplam);


     //Soru 2: Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        //        yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        //        değişken arasındaki farkı yazdırınız.


      String deger1="103";
      byte yeniDeger1=Byte.valueOf(deger1);

      String deger2="2351";
      short yeniDeger2=Short.valueOf(deger2);

        System.out.println(yeniDeger1-yeniDeger2);
    }
}
