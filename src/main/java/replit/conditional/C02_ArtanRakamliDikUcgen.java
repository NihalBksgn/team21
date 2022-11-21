package replit.conditional;

public class C02_ArtanRakamliDikUcgen {
    /*
  1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

    Beklenen çıltı:

            1
            12
            123
            1234
            12345
            123456
            1234567
            12345678
            123456789
            12345678910

     */
    public static void main(String[] args) {
//        int satir=10;
//
//        for(int i=1; i<=satir; i++){
//            for(int sütun =1; sütun<=i; sütun++){
//                System.out.print(sütun);
//            }
//            System.out.println();
//        }

        //// example 3= asagidaki sekli cizen kodu yaziniz
        ////  * * * *
        ////  * * *
        ////  * *
        ////  *

        for(int satir=1; satir<5; satir++){
            for(int sutun=4; sutun>=satir; sutun--){
                System.out.print("* "+ " ");
            }
            System.out.println();
        }

    }
}
