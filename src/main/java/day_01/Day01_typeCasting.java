package day_01;

public class Day01_typeCasting {

    public static void main(String[] args) {

        //Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.

        short a=12;
        int b=a;

    //Soru 2: Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
        long x=15L;
        int y=(int)x;

    //Soru 3: Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.

      double c=5.6;
      float f=(float)c;

       //Soru 4: Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
        //        Sonrasında bu short değişkenin değerini konsolda yazdırınız.
        //        Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.

        double d=12.5;
        short s=(short)d;
        System.out.println(s);

      // Soru 5: Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
        //         Sonrasında bu double değişkenin değerini konsolda yazdırınız.
        //         Not : Çıktıya dikkat ediniz, ondalık bir değer olacaktir.

      byte m=15;
      double n=m;

        System.out.println("n = " + n);



    }
}
