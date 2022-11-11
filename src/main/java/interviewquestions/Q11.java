package interviewquestions;

public class Q11 {
    /* soru 11)
 Girilen bir stringin harflerini teker teker ekrana alt alta olacak
 sekilde yazdiriniz, "bosluk" veya "a" harfi geldiginde bunlari yazmasin
*/
    public static void main(String[] args) {
        String str = "Java ist nicht einfach";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)==' '){
                continue;
            }
            System.out.println(str.charAt(i));
        }

        String str2 ="Java ist nicht einfach";
        String bos ="";
        for (int i=0;i<str.length();i++) {
            if (!(str.substring(i,i+1).equals("a")|| str.substring(i,i+1).equals(" "))){
                bos+=str.substring(i,i+1);
            }

        }

        System.out.println(bos);
    }
}
