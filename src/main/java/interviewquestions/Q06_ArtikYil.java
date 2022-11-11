package interviewquestions;

public class Q06_ArtikYil {
    /*
//  Artik Yil: Miladi takvime göre 365 gün olan yılın 366 gün olduğu yıla denmektedir.
// Normalde 28 gün olan Şubat ayının 4 senede bir 29 çekmesiyle artık yıl yaşamış oluruz.
// Dört yılda bir gelen 366 günlük yil
//
//*/
//
///*
//Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
//
//i)Yil 100 e bolunursa 400 e de bolunmelidir.      ==> 1600+ (artik yil) 1800-(artik yil degil)
//
//ii)Yil 100 e bolunmezse 4 e bolunmelidir. ==> 1996+ (artik yil)  2001-(artik yil degil)
//*/
    public static void main(String[] args) {

        int yil=1996;

        if(yil%100==0 && yil%400==0){
            System.out.println("Artik yildir");
        }else if(yil%100!=0 && yil%4==0){
            System.out.println("Artik yil");
        }else{
            System.out.println("Artik yil DEGILDIR");
        }
    }
}
