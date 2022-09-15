public class Mean {
    private static double Mean(float[] numbers){
       double jumlahData=0;
       double banyakData=0;
       double mean;
       double rounded;

       for (float i=0; i<numbers.length; i++){
           jumlahData += numbers[(int) i];
       }

       banyakData= numbers.length;

       mean = jumlahData/banyakData;
       rounded = Math.round(mean * 10) / 10.0;
       return rounded;
    }

    public static void main(String[] args) {
        float[] numbers = {1,2,3,4};
        System.out.println(Mean(numbers));
    }
}
