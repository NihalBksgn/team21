package interviewquestions;

import java.util.Scanner;

public class Q07_fibonacci {
    /*
    //Fibonacci dizisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
    //*/
    //
    ///*
    //Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    //0-1-1-2-3-5-8-13-21-34....
    //*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= input.nextInt();
        int a=0;
        int b=1;
        int toplam= 0;
        System.out.print(a+ " ");
        System.out.print(b+ " ");

        for(int i=0; i<sayi; i++){
            toplam= a+b;
            a=b;
            b=toplam;

            if(toplam>sayi){
                break;
            }
            System.out.print(toplam + " ");
        }




    }
}
