package day_01;

public class Day01_variables {
    public static void main(String[] args) {

        //Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
        //toplamını konsola yazdırınız.

        double gomlekFiyat=17.0;
        double sapkaFiyat=7.5;
        double ayakkabiFiyat=50.0;
        double toplam=gomlekFiyat+sapkaFiyat+ayakkabiFiyat;
        System.out.println("toplam = " + toplam);


    //Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
        //değişkenlerin değerlerinin çarpımını konsolda yazdırınız.

        float a=555F;
        long b=150;
        int c=123;

        double carpim=a*b*c;
        System.out.println(carpim);

        ////Soru 3:Basit faizi bulmak için bir kod yazınız.
        //    //Not: Basit faiz formülü = anapara * oran * yılDegeri /100

        int anapara=1000;
        int oran=6;
        byte yil=8;

        int basitFaiz=anapara*oran*yil/100;
        System.out.println("basitFaiz = " + basitFaiz);

        //// Soru 4:Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
        //    //        toplamını ve çarpımını String ile yazdırınız.


        String x="sonuc:";
         long y=456789;
         long z=100000;

         long toplam1=y+z;
         long carpim1=y*z;

        System.out.println(x+ toplam1);
        System.out.println(x+ carpim1);

// Soru 5: Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
//         ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.

        boolean k=true;
        boolean l=false;
        System.out.println(k + " " + l);

        //Soru 6:3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
        //         Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.

        long kitap=15;
        long defter=5;
        long laptop=1000;

        long toplam2=(2*kitap)+(4*defter)+(3*laptop);
        System.out.println("toplam2 = " + toplam2);








    }
}
