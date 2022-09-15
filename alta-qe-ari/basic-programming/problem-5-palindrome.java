public class Palindrome {
    private static boolean palindrome(String value){

        String reverse="";
        for(int i=value.length()-1; i>=0; i--){
            reverse += value.charAt(i);
        }
        boolean palindrome = true;
        for(int i=0; i<value.length(); i++){
            if(value.charAt(i) != reverse.charAt(i)){
                palindrome=false;
            }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}
