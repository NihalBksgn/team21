package day_07;

public class WhileLoop {
    public static void main(String[] args) {

        //while loop kullanarak uc basamakli sayilardan 15,20 ve 90 a tam bolunebilen sayilari yaziniz.
        int sayi=100;

        while(sayi<1000){

            if(sayi%15==0 && sayi%20==0 && sayi%90==0) {
                System.out.print(sayi + " ");
            }
           sayi++;
        }
    }
}
