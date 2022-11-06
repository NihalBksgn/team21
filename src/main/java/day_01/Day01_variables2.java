package day_01;

public class Day01_variables2 {

    public static void main(String[] args) {

     //Soru 7:İki tamsayıyı değiştirmek için bir kod yazınız.

//        Scanner input=new Scanner(System.in);
//
//        System.out.println("iki tam sayi giriniz");
//
//        int a= input.nextInt();
//        int b= input.nextInt();

        //1.yol
//        int x=a;
//        a=b;
//        b=x;
//
//        System.out.println("degistikten sonra a:" + a);
//        System.out.println("degistikten sonra b:" + b);

        //2.yol:
        int sayi1=10;
        int sayi2=20;

         sayi1=sayi1+sayi2;
         sayi2=sayi1-sayi2;
        System.out.println(sayi2);

        sayi1=sayi1-sayi2;
        System.out.println(sayi1);
    }
}
