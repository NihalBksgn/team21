package day_04loops;

public class Loop_01 {
    public static void main(String[] args) {


       //SORU 1:120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.

        //1.yol:
        for(int i=120; i>10; i--){
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //.2 yol:
        int i= 120;
        while(i>10){
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
            i--;
        }
        System.out.println();
        //3.yol:
         int k =120;
        do{
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
          k--;
        }while(k>10);
        System.out.println();

        //Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces
        String str="accessories";
        String s="";
        for(int m=0;m<str.length(); m++){
           String ch =str.substring(m,m+1);
            if(str.indexOf(ch)!=str.lastIndexOf(ch)){
                if(!s.contains(ch)){
                    s=s + ch;
                }
            }
        }
        System.out.print(s);

        System.out.println();
        //SORU 4:Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //Örnek; 223878 ´ 37

        int num=223878;
        String yeninum=String.valueOf(num);

        for(int e=0; e<yeninum.length();e++){
            char c=yeninum.charAt(e);

            if(yeninum.indexOf(c)==yeninum.lastIndexOf(c)){
                System.out.print(c);
            }
        }
        System.out.println();
        //SORU 5: Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //        A A A A A
        //        A A A A A
        //        A A A A A

        int satir=3;
        int sutun =5;
        for(int p =1; p<=satir; p++){

            for(int r =1; r<=sutun; r++){
                System.out.print("A ");
            }
            System.out.println();
        }



     }

}
