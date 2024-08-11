public class Palindrome {

    public static void main(String[] args) {


        String str = "nayan";
        String rev = "";
        int strlength = str.length();

        for(int i=str.length();i>0;i--){
             rev = rev + str.charAt(i-1);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
