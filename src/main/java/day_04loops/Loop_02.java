package day_04loops;

public class Loop_02 {
    public static void main(String[] args) {
        //SORU 6:Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //  A
        //  A A
        //  A A A
        //  A A A A

        int satir=4;

        for(int i= 1; i<=satir; i++){
            for(int k=1; k<=i; k++){
                System.out.print("A ");
            }
            System.out.println();
        }
        //SORU 7:Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int num =3;
        for(int i=1;i<11;i++){
            System.out.println(num +"x" + i +"=" + (num*i));
        }

        //SORU 8 :20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        //bırakarak yazdırmak için gereken kodu yazınız.

        for(int i =20; i>2; i--){

            if(i%2!=0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
        //SORU 9:String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 'Ali Can?' ==> l*i*a*n*

        String isim ="Ali Can?";
        String yeni =isim.replaceAll("[^a-z]","");
        String bos="";
        for(int i=0;i<yeni.length();i++){

            String son =yeni.substring(i,i+1);
            bos= bos + son + "*" ;
        }
        System.out.println(bos );
    }
}
