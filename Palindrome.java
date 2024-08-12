public class Palindrome {

    public static void main(String[] args) {

        String str = "nayan";
        int n = str.length();

        // Loop to check if the string is a palindrome
        for(int i = 0; i < n ; i++) {
            if(str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("It's not a palindrome");
                return;
            }
        }

        System.out.println("Palindrome");
    }
}