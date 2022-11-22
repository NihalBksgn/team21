package mentor_tasks.kimlikmap;

import java.util.HashMap;
import java.util.Scanner;

public class KimlikYap {

    static HashMap<String, Persons> person = new HashMap<>();

    static Scanner input = new Scanner(System.in);


    static void selectOption() {
        System.out.println("yapmak istediginiz islemi giriniz :\n0:islemi sonlandir\n" +
                "1:kullanici ekle\n2:kullanici bilgisi alma\n3:kullanici silme");
            int secim = input.nextInt();//nextLine hata verir.çünkü bir üst satır println değil print olduğu için tum satırı alır.
            switch (secim) {
                case 0:
                    cikis();
                    break;
                case 1:
                    saveInfo();
                    selectOption();
                    break;
                case 2:
                    getInfo();
                    selectOption();
                    break;
                case 3:
                    removeInfo();
                    selectOption();
                    break;
                default:
                    System.out.println("yanlis giris yaptiniz. Tekrar deneyiniz");
                    selectOption();
                    break;
    }
}



    public static  void saveInfo(){

        System.out.println("Id numaranizi giriniz");
        String idNumber=input.next();

        if(idNumber.length()!=4 || idNumber.equals(null)){
            System.out.println("Girilem id yanlis");
            saveInfo();
        }else if(person.containsKey(idNumber)){
            System.out.println("Zaten varolan bir IdNumber girdiniz...Kontrol ederek tekrar deneyiniz");
            saveInfo();
        }else{
            System.out.println("Lutfen Ad giriniz");
            String ad= input.next();

            System.out.println("Lutfen Soyadinizi giriniz");
            String soyAd= input.next();

            System.out.println("Lutfen adresinizi giriniz");
            String adres= input.next();

            System.out.println("telefon numaranizi giriniz");
            String telNumber = input.next();

            Persons p01 =new Persons(ad.concat(soyAd),adres,telNumber);

            person.put(idNumber,p01);
            System.out.println(person);

        }
    }

    public static void cikis(){
        System.out.println("Cikis basariyla yapildi");
    }

 public static void getInfo(){

     System.out.println("Lutfen bilgi almak istediginiz kisinin id numarasini giriniz");
     String idNumber= input.next();
     person.get(idNumber);

     if(!person.containsKey(idNumber)){
         System.out.println("Girdiginiz Id numarasina sahip bir kisi yoktur");
         getInfo();
     }else{
         System.out.println(person.get(idNumber));
     }
 }


 public static void removeInfo(){
     System.out.println("Silmek istediginiz kisinin id numarasini giriniz");

     String idNumber = input.next();

     if(!person.containsKey(idNumber)){
         System.out.println("Girdiginiz id sistemde kayitli degil");
         removeInfo();
     }else{
         person.remove(idNumber);
         System.out.println("silme islemi basariyla tamamlandi");
         System.out.println(person);
     }
 }



    }//class


