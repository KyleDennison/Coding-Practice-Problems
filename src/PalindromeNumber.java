public class PalindromeNumber {

    public PalindromeNumber(){}

    //Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

    public boolean isPalindrome(int x) {
        String start = x + "";
        int length = start.length()-1;
        String end = "";
        for(int i = length; i >= 0; i-- ){
            end = end + start.charAt(i);
        }

        if(start.equals(end)){
            return true;
        }
        else{
            return false;
        }
    }
}
