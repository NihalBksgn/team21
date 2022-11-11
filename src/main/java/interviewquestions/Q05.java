package interviewquestions;

import java.util.Scanner;

public class Q05 {

    /*
        Kullanicidan iki şayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz
        (Method olusturarak yapiniz)
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz");
        int a = input.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        int b = input.nextInt();
        topla(a,b);

    }

    public static void topla(int a, int b) {


        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}