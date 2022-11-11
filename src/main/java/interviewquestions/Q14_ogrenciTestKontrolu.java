package interviewquestions;

public class Q14_ogrenciTestKontrolu {
    /*   soru 14)
Ogrencilerin test sonuclarini degerlendiren Java kodunu  yaziniz
//10 sorumuz var
//ogrencilerin cevaplari
char[][] answers ={
{'B','B','E','C','C','D','E','E','A','D'},
{'B','B','A','C','C','D','E','E','A','D'},
{'E','B','E','C','C','D','E','E','A','D'}};
// cevap anahtari
char[] keys = {'D','B','D','C','C','D',
'A','E','A','D'};
output:
1 nolu ogrencinin dogru cevap sayisi :7
2 nolu ogrencinin dogru cevap sayisi :7
3 nolu ogrencinin dogru cevap sayisi :7
*/
    public static void main(String[] args) {
        char[][] answers ={
                {'A','A','E','C','C','D','A','E','B','D'},
                {'B','B','A','C','C','D','E','E','A','D'},
                {'B','A','A','C','C','D','E','E','A','D'}};

        char[] keys = {'D','B','D','C','C','D','A','E','A','D'};

        for (int i = 0; i < answers.length; i++) {
            int sayac=0;

            for(int k=0; k<keys.length; k++){

                if(answers[i][k]==keys[k]){
                    sayac++;
                }
            }
            System.out.println((i+1) + "nolu ogrencinin dogru cevap sayisi: " +sayac);
        }
    }
}
