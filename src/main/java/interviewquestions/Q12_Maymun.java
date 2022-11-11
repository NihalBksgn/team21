package interviewquestions;

public class Q12_Maymun {

    /*  soru 12)
  Adada yalnız bir maymun var Her gün 4 muz yemesi gerekiyor o adada sadece 165 muz var
 Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
  Do while döngüsü,
artırma ve eksiltme ve if deyimlerini kullanın
 int MuzSayısı =165, hayatta kalmaDays = 0;
    */

    //Maymunun kac gun hayatta kalacagini gosteren kod
    //Hayatta kaldigi suerece muz vermelisin
    //(DO While)
    //eger 4 ten az muz kalirsa maymunlar olur
    public static void main(String[] args) {


        int muzSayisi=165;
        int yasadigiGun=0;

        do{

            muzSayisi-=4;
            yasadigiGun++;

        }while(muzSayisi>3);
        System.out.println("Maymun "+yasadigiGun+" gun kadar yasamıstır");
    }
}
