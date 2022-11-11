package interviewquestions;

public class Q03_Palindrom {
    // Kullanicidan bir String aliniz. palindrom olup olmadigini kontrol eden bir kod yaziniz
    public static void main(String[] args) {
        String str = "anna";
        String ters = "";

        for(int i=str.length()-1; i>=0; i--){
            ters+=str.charAt(i);
        }
        if(str.equals(ters)){
            System.out.println("palindrom");
        }else{
            System.out.println("Palindrom degil");
        }


        //2.yol
        StringBuilder strb = new StringBuilder(str);
        String tersstr= strb.reverse().toString();

        if(tersstr.equals(str)){
            System.out.println("palindrom");
        }else{
            System.out.println("Palindrom degil");
        }



    }

}
