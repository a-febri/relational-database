public class BilanganPrima {
    private static boolean primeNumber(int number){
        boolean primeNumber = true;

        for (int i=2; i<number; i++){
            if(number%i==0){
                primeNumber=false;
                break;
            }
        }
        return primeNumber;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}
