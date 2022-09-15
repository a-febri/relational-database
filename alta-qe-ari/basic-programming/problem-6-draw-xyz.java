public class DrawXYZ {
    private static void DrawXYZ(int n){
       int k;
       for (int i=0; i<n ; i++){
           for (int j=1; j<=n; j++){
               k=((i*n)+j);
           if (k % 3 == 0){
               System.out.print("X ");
           }
           else if (k % 2==0) {
               System.out.print("Z ");
           }
           else {
               System.out.print("Y ");
           }
       }
           System.out.println();
       }
    }

    public static void main(String[] args) {
        System.out.println("Draw dengan input 3");
        DrawXYZ(3);
        System.out.println("Draw dengan input 5");
        DrawXYZ(5);
        System.out.println("Draw dengan input 1");
        DrawXYZ(1);

    }
}