package mentor_tasks;

import java.util.HashSet;

public class Task_05 {
    /*
    // Verilen bir String'deki harfleri ve harflerin kacar kez kullanildigini
        // return eden bir method yaziniz
        //  Ornek : Input : Zeynep Hoca bir tane   output : { =3, a=3, b=1, r=1, C=1, c=1, t=1, e=1, H=1, i=1, n=2, o=1}
        String input="Zeynep Hoca bir tane";
     */
    public static void main(String[] args) {
        String str = "Zeynep Hoca bir tane";
        karakterSayilariniBul(str);

    }

    public static void karakterSayilariniBul(String str) {


        String[] arr = str.split("");
        String bos = "";
        for (String w : arr) {
            int counter = 0;
            for (String k : arr) {

                if (w.equalsIgnoreCase(k)) {
                    counter++;
                }
            }
            if (!bos.contains(w)) {
                bos += w + counter + " ";

            }

        }
        System.out.println(bos);
    }
}