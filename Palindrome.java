public class Palindrome {

    public static void main(String[] args) {


        String str = "nayan";
        String rev = "";
        int strlength = str.length();

        for(int i=str.length()-1;i>=0;i--){
             rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(",Palindrome");
        }else {
            System.out.println("Its,Not a palindrome");
        }
    }
}
